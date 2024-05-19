package com.hewen.test;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        int book=12;
        int pencil=1;
        int easer=2;
        int coco=3;
        int snake=5;
        int total=8;
        System.out.println("书本的价格为"+book+"元，您总共有20元");
        System.out.println("1.铅笔的价格为："+pencil+"元");
        System.out.println("2.橡皮的价格为："+easer+"元");
        System.out.println("3.可乐的价格为："+coco+"元");
        System.out.println("4.零食的价格为："+snake+"元");

        Scanner sc=new Scanner(System.in);
        int index= sc.nextInt();
        switch(index){
            case 1:
                int pencilmoney=20-book;///8
                int cnt1=pencilmoney/pencil;//8
                int remain1=pencilmoney-pencil*cnt1;
                System.out.println("购买完书本后还可以买铅笔"+cnt1+"个，还剩"+remain1+"元");
                break;

            case 2:
                int easermoney=20-book;
                int cnt2=easermoney/easer;//8
                int remain2=easermoney-easer*cnt2;
                System.out.println("购买完书本后还可以买橡皮"+cnt2+"个，还剩"+remain2+"元");
                break;
            case 3:
                int cocomoney=20-book;
                int cnt3=cocomoney/easer;//8
                int remain3=cocomoney-coco*cnt3;
                System.out.println("购买完书本后还可以买可乐"+cnt3+"个，还剩"+remain3+"元");
                break;

            case 4:
                int snakemoney=20-book;
                int cnt4=snakemoney/snake;//8
                int remain4=snakemoney-snake*cnt4;
                System.out.println("购买完书本后还可以买零食"+cnt4+"个，还剩"+remain4+"元");
                break;

        }
    }
}
