package com.hewen.test;

import java.util.Random;
import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        int cnt = 0;//平局
        int win = 0;
        int fault = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("程序已启动");
        System.out.println("剪刀 石头 布");

        for (int i = 1; i <= 5; i++) {
            String enter = sc.next();//输入
            Random r = new Random();//随机生成一个数字1-3
            int number = r.nextInt(3) + 1;
            System.out.println("第" + i + "局");
            if (enter.equals("剪刀")) {
                if (number == 1) {
                    System.out.println("电脑出的剪刀");
                    System.out.println("平局");
                    cnt++;
                }//平局
                else if (number == 2) {
                    System.out.println("电脑出的石头");
                    System.out.println("你输了");
                    fault++;
                }// 剪刀对石头 我输
            else {
                System.out.println("电脑出的布");
                System.out.println("你赢了");
                win++;
            }//剪刀对布 我赢
        }

            if (enter.equals("石头")) {
                if (number == 1) {
                    System.out.println("电脑出的剪刀");
                    System.out.println("你赢了");
                    win++;

                }//平局
                else if (number == 2) {
                    System.out.println("电脑出的石头");
                    System.out.println("平局");
                    cnt++;
                }// 剪刀对石头 我输
                else {
                    System.out.println("电脑出的布");
                    System.out.println("你输了");
                    fault++;
                }//剪刀对布 我赢
            }

            if (enter.equals("布")) {
                if (number == 1) {
                    System.out.println("电脑出的剪刀");
                    System.out.println("你输了");

                    fault++;

                }//平局
                else if (number == 2) {
                    System.out.println("电脑出的石头");
                    System.out.println("你赢了");
                    win++;

                }// 剪刀对石头 我输
                else {
                    System.out.println("电脑出的布");
                    System.out.println("平局");
                    cnt++;
                }//剪刀对布 我赢
            }
        }
        if(cnt==5) System.out.println("此次是平局");

        else {
            System.out.println("本次游戏您赢了"+win+"局，输了"+fault+"局");
            if(win>fault) System.out.println("您赢了！！！");
            else System.out.println("你输了~");
        }
    }
}

