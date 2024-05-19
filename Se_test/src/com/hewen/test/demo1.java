package com.hewen.test;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        /*华为*/
        String Hbrand="华为";
        double Hsize=5.5;
        double Hprice=3688.88;
        String Hpeizhi="8+128g 全面刘海屏";
        /*小米*/
        String Xbrand="小米";
        double Xsize=5.0;
        double Xprice=2988.88;
        String Xpeizhi="4+64g 全面屏";

        Scanner sc=new Scanner(System.in);
        int Hnumber=sc.nextInt();
        int Xnumber=sc.nextInt();
  /*      double Htotal=sc.nextInt();
        double Xtotal=sc.nextInt();*/
        int number=Hnumber+Xnumber;
        double Htotals=Hprice*Hnumber;
        double Xtotals=Xprice*Xnumber;
        double totals=Htotals+Xtotals;
        System.out.println("库存小米的总金额"+Xtotals);
        System.out.println("----------------库存清单--------");
        System.out.println("品牌型号"+"尺寸"+"价格"+"配置"+"库存数量"+"总价");
        System.out.println(Hbrand+"    "+Hsize+"    "+Hprice+"    "+Hpeizhi+"    "+Hnumber+"    "+Htotals);
        System.out.println(Xbrand+"    "+Xsize+"    "+Xprice+"    "+Xpeizhi+"    "+Xnumber+"    "+Xtotals);
        System.out.println("------------------------------");
        System.out.println("总库存"+number);
        System.out.println("库存总价"+totals);
    }
}