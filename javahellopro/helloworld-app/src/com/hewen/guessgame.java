package com.hewen;

import java.util.Random;
import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {
        Random r=new Random();
        int lucknumber=r.nextInt(10)+1;//生成一个幸运数字
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入一个数字：");
            int guessnumber =sc.nextInt();//扫描客户输入的数字
            if(guessnumber<lucknumber) System.out.println("您猜的过小了");
            else if(guessnumber>lucknumber) System.out.println("您猜的过大了");
            else {
                System.out.println("您猜对了");
                break;
            }
        }
     }
}
