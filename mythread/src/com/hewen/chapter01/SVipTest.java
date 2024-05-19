package com.hewen.chapter01;

public class SVipTest {
    public static void main(String[] args) {
        User user = new User();
        Thread thread1 = new Thread(user);
        thread1.start();
    }
}

class SVip implements Runnable {
    private boolean isContinue;

    public boolean isContinue() {
        return isContinue;
    }

    public void setContinue(boolean aContinue) {
        isContinue = aContinue;
    }

    public SVip() {
    }

    public SVip(boolean isContinue) {
        this.isContinue = isContinue;
    }

    @Override
    public void run() {
        synchronized (this){
            System.out.println("此时来了一位SVip用户");
            System.out.println("SVip用户开始办理业务");
            System.out.println("SVip用户办理倒计时");
            for (int i = 10; i >=0 ; i--) {
                System.out.println(i+"秒");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i==0){
                    break;
                }
            }
        }
    }
}

class User implements Runnable {
    SVip sVip = new SVip(true);
    Thread thread = new Thread(sVip);
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("办理用户窗口在正常排队中");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (sVip.isContinue()){
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sVip.setContinue(false);
            }
        }
    }
}


