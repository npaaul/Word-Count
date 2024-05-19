package com.hewen.practice;

public class practice6 {
    public static void main(String[] args) {
        System.out.println(search(101,200));
    }
    public static int search(int start,int end){
        int cnt=0;//计数
        for (int i = start; i <= end; i++) {

            boolean flag=true;
            for (int j = 2; j <= i/2; j++) {
                if(i%j==0) {
                    flag = false;
                    break;//不是素数；
                }
            }
            //是素数
            if(flag){
                System.out.println(i);
                cnt++;
            }
        }
        return cnt;
    }
}
