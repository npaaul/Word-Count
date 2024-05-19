package com.hewen;

public class hello {
    public static void main(String[] args) {
//        int sum=0;
//        for (int i = 0; i <5 ; i++) {
//            sum+=i;
//        }
//        System.out.println("1到5的数据和是："+ sum);
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                //System.out.println("------------");
            }
            System.out.println("");
        }
    }
}