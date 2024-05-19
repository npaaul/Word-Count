package com.hewen.demo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
                Car[] arr=new Car[3];
   //             Scanner sc = new Scanner(System.in);
        Car c1=new Car("1",200,"super");
        Car c2=new Car("1",200,"super");
        Car c3=new Car("1",200,"super");
        arr[0]=c1;
        arr[1]=c2;
        arr[2]=c3;
/*                for (int i = 0; i < arr.length; i++) {
                    Car c=new Car();
                    System.out.println("请输入汽车名称：");
                    String brand =sc.next();
                    c.setBrand(brand);
                    System.out.println("请输入汽车价格：");
                    int price=sc.nextInt();
                    c.setPrice(price);

                    System.out.println("请输入汽车颜色：");
                    String colour=sc.next();
                    c.setColour(colour);

//输入完所有属性；
                    arr[i]=c;
                }*/
                int sum=0;
                for (int i = 0; i < arr.length; i++) {
                    Car car=arr[i];
                    sum+=car.getPrice();
                    System.out.println(car.getBrand() +car.getPrice()+car.getColour());
                }
                double average=sum*1.0/3;
        System.out.println(average);
            }
}
