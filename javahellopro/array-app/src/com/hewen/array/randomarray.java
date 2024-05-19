package com.hewen.define;

import java.util.Random;
import java.util.Scanner;

public class randomarray {
    public static void main(String[] args) {
        int[] codes={0,0,0,0,0};
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入第"+(i+1)+"个员工的工号：");
            int index= sc.nextInt();//输入一个数据保存在index；
            codes[i]=index;//12 33 54 26 8
        }
        Random r=new Random();
        for (int i = 0; i < codes.length; i++) {
            int code=r.nextInt(codes.length);//随机生成一个数字0-4
            int temp=codes[code];//temp=codes[3];
            codes[code]=codes[i];
            codes[i]=temp;
        }
        for (int i = 0; i < codes.length; i++)
        System.out.print(codes[i]+" ");
    }
}
