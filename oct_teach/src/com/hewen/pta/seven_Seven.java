package com.hewen.pta;

import java.util.Scanner;

public class seven_Seven {
    public static void main(String[] args) {
        Square s1=new Square();
        System.out.println("s1:edge="+s1.getEdge());
        System.out.println("s1:area="+s1.getArea());
        Square s2=new Square();
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        s2.setEdge(e);
        System.out.println("s2:edge="+s2.getEdge());
        System.out.println("s2:area="+s2.getArea());

    }
}
class Square{
    private int edge;

    public Square() {
        edge=2;
        System.out.println("this is constructor method");
    }

    public Square(int edge) {
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        if(edge<=0) this.edge=1;
        else this.edge = edge;
    }
    public int getArea(){
        int area;
        return  area=edge*edge;
    }
}
