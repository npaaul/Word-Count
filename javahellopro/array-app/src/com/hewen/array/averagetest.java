package com.hewen.define;

import java.util.Scanner;
//求平均分数
public class averagetest {
    public static void main(String[] args) {
        double[] scores=new double[6];
        double sum=0;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+(i+1)+"评委的分数：");
            double data=sc.nextInt();
            scores[i]=data;//把每个值赋给数组
            sum +=data;
        }
        System.out.println(sum/scores.length);
    }
}
