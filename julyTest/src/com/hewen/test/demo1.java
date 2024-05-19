package com.hewen.test;

import java.awt.*;
import java.util.*;
import javax.swing.JPanel;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        IGeometry [] tuxing=new IGeometry[29]; //有29个Geometry对象
        for(int i=0;i<tuxing.length;i++) {   //29个Geometry对象分成两类
            if(i%2==0)
                tuxing[i]=new Rect(16+i,68);
            else if(i%2==1)
                tuxing[i]=new Circle(10+i);
        }
        TotalArea computer=new TotalArea();
        computer.setTuxing(tuxing);
        System.out.printf("各种图形的面积之和:\n%.2f",computer.computerTotalArea());

    }
}

/* 请在这里填写答案  请结合主类代码，在代码框完成IGeometry接口类，Rect类，Circle类和TotalArea类*/
/* 请在这里填写答案  请结合主类代码，在代码框完成IGeometry接口类，Rect类，Circle类和TotalArea类*/
interface IGeometry{
    public double getArea();
}
class Rect implements IGeometry {
    public double a;
    public double b;
        public Rect(double a,double b){
            super();
            this.a=b;
            this.b=a;
        }
        public double getArea(){

            return a*b;
        }
}
class Circle implements IGeometry{
    public double r;
    public Circle(double r){
        super();
        this.r=r;
    }
    public double getArea(){
        return r*r*3.14;
    }
}
class TotalArea {
    public IGeometry[] tuxing;

    public void setTuxing(IGeometry[] t) {
        this.tuxing = t;
    }

    public double computerTotalArea(){
        double sum=0.0;
       // int score=0;
        for (IGeometry i : tuxing) {
            sum += i.getArea();
        }
        return sum;
    }
}