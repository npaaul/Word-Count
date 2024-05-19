package com.hewen.test2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        double s=0;
        Scanner sc=new Scanner(System.in);
        double r1,r2;
        r1=sc.nextDouble();
        r2=sc.nextDouble();
        Circle c1=new Circle(r1);
        Circle c2=new Circle(r2);
        try{
            s = c1.area();
            System.out.println(s);
            s = c2.area();
            System.out.println(s);
        }
        catch (CircleException e){
            e.print();
        }
    }
}


/* 请在这里填写答案 编写Circle 和CircleException类*/
class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double area() throws CircleException {
        if (r < 0) {//异常
            CircleException e = new CircleException(r);
            throw e;//抛出异常
        }
        return 3.14 * r * r;
    }
}
class CircleException extends Exception{
        double r;
    CircleException(double r){
        this.r=r;
    }
    public void print(){
        System.out.println("圆的半径为"+r+"不合理");
    }
}

