package com.hewen.test;

public class demo9 {
    public static void main(String[] args) {
        for (int i = 1; i <=99 ; i++){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        int sum=0;
        for (int i = 1;i <=99 ; i++) {
            if(i%2!=0) sum +=i;
        }
        System.out.println(sum);
    }
}
