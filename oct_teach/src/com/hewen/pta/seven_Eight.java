package com.hewen.pta;

import java.util.Scanner;

public class seven_Eight {
    public static void main(String[] args) {
        Circle c1=new Circle();
        System.out.println(c1);
        System.out.println("c1:area="+c1.getArea());

        Circle c2=new Circle();
        System.out.println(c2);
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        c2.setRadius(r1);
        System.out.println(c2);
        System.out.println("c2:area="+c2.getArea());

        int r2=sc.nextInt();
        Circle c3 =new Circle(r2);
        System.out.println(c3);
        System.out.println("c3:area="+c3.getArea());
    }
}
class Circle{
    private int radius;

    public Circle() {
        radius=2;
        System.out.println("this is a constructor");
    }

    public Circle(int radius) {
        if(radius<=0) {
            this.radius=2;
        } else
            this.radius = radius;
        System.out.println("this is a constructor with para");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius<=0)
            this.radius=2;
        else this.radius = radius;
    }
    public int getArea(){
        double a=Math.PI*radius*radius;
        return (int)a;
    }

    @Override
    public String toString() {
        return "Circle [" +
                "radius=" + radius +
                ']';
    }
}