package com.hewen.pta;

import java.util.Scanner;

import static java.lang.Math.pow;

public class sevenSeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0) System.out.println(32);
        else if(n>0&&n<=pow(2,32)){
            int i=1;
            while(n>0){
                n /= 2;
                i++;
            }
            System.out.println(32-i);
        }
        else System.out.println(0);
    }
}
