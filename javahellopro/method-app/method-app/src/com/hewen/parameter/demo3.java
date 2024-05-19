package com.hewen.parameter;

public class demo3 {
    public static void main(String[] args) {
        fire(2,"日本");
        fire();
        fire("日本");
    }
    public static void fire(){
        System.out.println("发射一枚");
    }
    public static void fire(String country){
        System.out.println("向"+country+"发射了一枚");
    }
    public static void fire(int n,String country){
        System.out.println("发射了"+n+"枚到"+country);
    }
}
