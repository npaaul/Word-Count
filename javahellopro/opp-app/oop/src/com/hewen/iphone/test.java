package com.hewen.iphone;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Iphone[] arr = new Iphone[3];
        Iphone p1 = new Iphone("小米",1999,"白色");
        Iphone p2 = new Iphone("华为",4999,"蓝色");
        Iphone p3 = new Iphone("魅族",3999,"红色");

        //3.把手机对象添加到数组当中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        double sum=0;
       // double[] arr1=new double[3];
        for (int i = 0; i <arr.length ; i++) {
          Iphone iphone =arr[i];
          sum+=iphone.getPrice();
        }
         double average=1.0*sum/arr.length;
        System.out.println(average);
    }

}
