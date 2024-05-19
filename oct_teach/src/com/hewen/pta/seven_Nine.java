package com.hewen.pta;

import java.util.Scanner;

public class seven_Nine {
    public static void main(String[] args) {
        Ring r=new Ring();
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        r.setInnerRadius(i);

        int o=sc.nextInt();
        r.setOuterRadius(o);
        System.out.println(r.getArea());
        Ring r2=new Ring();
        System.out.println(r2.getArea());
    }
}
class Ring{
    private int innerRadius;
    private int outerRadius;

    public int getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(int innerRadius) {
        this.innerRadius = innerRadius;
    }

    public int getOuterRadius() {
        return outerRadius;
    }

    public void setOuterRadius(int outerRadius) {
        this.outerRadius = outerRadius;
    }

    public Ring(int innerRadius, int outerRadius) {
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
        System.out.println("constructor");
    }

    public Ring() {
        this(1,3);
    }
    public int getArea(){
        return (int)(Math.PI*outerRadius*outerRadius-Math.PI*innerRadius*innerRadius);
    }
}
