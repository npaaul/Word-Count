/*
package com.hewen.cars;

import java.util.Scanner;

public class RentMgrSys {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("请选择你要租赁的汽车类型：");
            int index=sc.nextInt();

            System.out.println("1.宝马    2.别克");
            System.out.println("请选择你要租赁的轿车品牌：");
            String brand=sc.next();

            if("1".equals(brand)){//宝马
                System.out.println("1.550i   2.X6");
                System.out.println("请选择你要租赁的轿车型号：");
                String type=sc.next();
                if("1".equals(type)){
                    System.out.println("请输入你要租赁的天数：");
                    int days=sc.nextInt();
                    System.out.println("分配给你的汽车品牌是：京CNY3284");
                    Car car=new Car("550i","宝马","京CNY3284",600);
                    System.out.println("您需要支付的租赁费用是："+car.calRent(days)+"元");
                }else if("2".equals(type)){
                    System.out.println("请输入你要租赁的天数：");
                    int days=sc.nextInt();
                    System.out.println("分配给你的汽车品牌是：京NY28588");
                    Car car=new Car("X6","宝马","京NY28588",800);
                    System.out.println("您需要支付的租赁费用是："+car.calRent(days)+"元");
                }
        } else if ("2".equals(brand)){//别克
                System.out.println("1.林荫大道   2.GL8");
                System.out.println("请选择你要租赁的轿车型号：");
                String type=sc.next();
                if("1".equals(type)){
                    System.out.println("请输入你要租赁的天数：");
                    int days=sc.nextInt();
                    System.out.println("分配给你的汽车品牌是：京NT37465");
                    Car car=new Car("林荫大道","别克","京NT37465",300);
                    System.out.println("您需要支付的租赁费用是："+car.calRent(days)+"元");
                }else if("2".equals(type)){
                    System.out.println("请输入你要租赁的天数：");
                    int days=sc.nextInt();
                    System.out.println("分配给你的汽车品牌是：京NT96968");
                    Car car=new Car("GL8","别克","京NT96968",600);
                    System.out.println("您需要支付的租赁费用是："+car.calRent(days)+"元");
                }
            }
        }
}

class Car{
    private String type;
    private String brand;
    private String vehicleld;//车牌号
    private int perRent;//日租金

    public Car() {
    }

    public Car(String type, String brand, String vehicleld, int perRent) {
        this.type = type;
        this.brand = brand;
        this.vehicleld = vehicleld;
        this.perRent = perRent;
    }

    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVehicleld() {
        return vehicleld;
    }

    public void setVehicleld(String vehicleld) {
        this.vehicleld = vehicleld;
    }

    public int getPerRent() {
        return perRent;
    }
    public float calRent(int days){
        float money;
        if(days>150) money=7/10*days*getPerRent();
        else if(days>30) {
            money=0.8F*days*getPerRent();
        } else if (days>7) {
            money=9/10*days*getPerRent();
        }else money=days*getPerRent();
        return money;
    }
}

*/
