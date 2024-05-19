package com.hewen.test;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        double yashua = 8.8;
        double maojin = 10.0;
        double shuibei = 18.8;
        double apple = 12.5;
        double banana = 15.5;
        System.out.println("-------------------小商城-----------------");
        System.out.println("1.牙刷的价格为：" + yashua + "元");
        System.out.println("2.毛巾的价格为：" + maojin + "元");
        System.out.println("3.水杯的价格为：" + shuibei + "元");
        System.out.println("4.苹果的价格为：" + apple + "元");
        System.out.println("5.香蕉的价格为：" + banana + "元");
        String buy = "Y";
        Scanner sc = new Scanner(System.in);
        while (buy.equals("Y")) {//****
            System.out.println("请输入你需要购买的商品序列号：");
            int index = sc.nextInt();

            switch (index) {
                case 1:
                    System.out.println("请输入你需要的牙刷数量：");
                    int number1=sc.nextInt();
                    double yashuamoney=number1*yashua;
                    System.out.println("你购买了牙刷"+number1+"支，需要花费"+yashuamoney+"元");
                    System.out.println("需要继续购买商品请输入Y，否则输入N");
                    buy=sc.next();//***
                    break;

                case 2:
                    System.out.println("请输入你需要的毛巾数量：");
                    int number2=sc.nextInt();
                    double maojinmoney=number2*maojin;
                    System.out.println("你购买了毛巾"+number2+"个，需要花费"+maojinmoney+"元");
                    System.out.println("需要继续购买商品请输入Y，否则输入N");
                    buy=sc.next();//***
                    break;

                case 3:
                    System.out.println("请输入你需要的水杯数量：");
                    int number3=sc.nextInt();
                    double shuibeimoney=number3*shuibei;
                    System.out.println("你购买了水杯"+number3+"个，需要花费"+shuibeimoney+"元");
                    System.out.println("需要继续购买商品请输入Y，否则输入N");
                    buy=sc.next();//***
                    break;

                case 4:
                    System.out.println("请输入你需要的苹果数量：");
                    int number4=sc.nextInt();
                    double applemoney=number4*apple;
                    System.out.println("你购买了苹果"+number4+"个，需要花费"+applemoney+"元");
                    System.out.println("需要继续购买商品请输入Y，否则输入N");
                    buy=sc.next();//***
                    break;

                case 5:
                    System.out.println("请输入你需要的香蕉数量：");
                    int number5=sc.nextInt();
                    double bananamoney=number5*banana;
                    System.out.println("你购买了香蕉"+number5+"个，需要花费"+bananamoney+"元");
                    System.out.println("需要继续购买商品请输入Y，否则输入N");
                    buy=sc.next();//***
                    break;

                default:
                    System.out.println("查无此商品！请输入正确的序列号：");
                    break;
            }
        }
        System.out.println("期待您的下次光临！");
    }
}
