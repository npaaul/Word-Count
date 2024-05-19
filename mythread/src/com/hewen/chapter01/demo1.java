package com.hewen.chapter01;

public class demo1 {
    public static void main(String[] args) {
        /*new TickeWindow().start();
        new TickeWindow().start();
        new TickeWindow().start();
        new TickeWindow().start();*/
        TickeWindow tw =new TickeWindow();
        new Thread(tw,"s1").start();
        new Thread(tw,"s2").start();
        new Thread(tw,"s3").start();
        new Thread(tw,"s4").start();


    }
}
class TickeWindow implements Runnable{
    private int tickets=100;
    public  void run(){
        while(true){
            if(tickets>0) {
                Thread th = Thread.currentThread();//
                String th_name = th.getName();
                System.out.println(th_name + "正在售票第 " + tickets-- + " 张票");
            }
        }
    }


}
