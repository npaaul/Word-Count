package com.hewen.teach;//异常

public class demo3 {
    public static void main(String[] args) {
        int result=divide(4,2);
        System.out.println(result);
    }
    public static int divide(int x,int y){
        int result=x/y;
        return result;
    }
}
