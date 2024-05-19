package com.hewen.practice;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {

        System.out.println(scores(5));
    }
    public static double scores(int n){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[n];
        double sum=0;
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第"+(i+1)+"位评委的分数：");
            int index=sc.nextInt();
            arr[i]=index;
            sum +=arr[i];
        }
        int max=arr[0];
        int min=arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]>max) max=arr[i];
        }
        for (int i = 1; i < n; i++) {
            if(arr[i]<min) min=arr[i];
        }
        return (sum-max-min)/(n-2);
    }
}
