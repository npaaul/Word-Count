package com.hewen.pta;

import java.util.Scanner;

public class sevenFour {
    public  static int GetNumber(int data){
        data=data>0?data:-data;
        if(data==0) return 1;
        else{
            int cnt=0;
            while(data!=0){
                data /= 10;
                cnt++;
            }
            return cnt;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        System.out.println(GetNumber(data));
        if(data==0) System.out.println("Y");
        if(data<0) System.out.println("N");
        int rem=0;
        int temp=data;
        int n=0;
        while(temp!=0){//12121
            rem=temp%10;//1
            n=n*10+rem;
            temp /=10;
        }
        if(data==n) System.out.println("Y");
        else System.out.println("N");
    }
}
