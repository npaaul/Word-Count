package com.hewen.ptaText;
//类和对象 封装继承、接口 多态
//非标题：需求 项目的背景 分析系统有什么功能（表格/功能结构图）
//      设计 类图 类与类之间的关系（继承 类对接口实现 关联关系（线连接） 依赖关系（即主类main与类的关系）（虚线箭头））
//           要说明类图的属性及类图实现的功能 和写体现了面向对象的什么特征什么思想
//
public class myThread {
    public static void main(String[] args) throws Exception {
        Text1 t1=new Text1();
        Text2 t2=new Text2();
        Text3 t3=new Text3();
        Text4 t4=new Text4();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        System.out.println(t1.getSum()+t2.getSum()+t3.getSum()+t4.getSum());
        }
}
class Text1 extends Thread{
    private int sum;
    public void run(){
        for (int i = 1; i <= 25; i++){
            sum += i;
        }
    }
    public int getSum(){
        return sum;
    }
}
class Text2 extends Thread{
    private int sum;
    public void run(){
        for (int i = 26; i <= 50; i++){
            sum += i;
        }
    }
    public int getSum(){
        return sum;
    }
}
class Text3 extends Thread{
    private int sum;
    public void run(){
        for (int i = 51; i <= 75; i++){
            sum += i;
        }
    }
    public int getSum(){
        return sum;
    }
}
class Text4 extends Thread{
    private int sum;
    public void run(){
        for (int i = 76; i <= 100; i++){
            sum += i;
        }
    }
    public int getSum(){
        return sum;
    }
}

