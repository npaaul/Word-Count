package com.hewen.practice;

public class practice1 {
    public static void main(String[] args) {

        System.out.println( equals(5,1000,"经济"));
    }
    public static double/*int*/ equals(int month,double price,String type){
        if(month>=5&&month<=10){
            if(type=="头等")  price=price*0.9;
            if(type=="经济")  price*=0.85;
        }
        else{
            if(type=="头等")  price=price*0.7;
            if(type=="经济")  price*=0.65;
        }
        return price;
    }
}
