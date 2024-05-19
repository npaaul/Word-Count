package com.hewen.teach;

import java.util.ArrayList;
import java.util.Scanner;

public class demo7 {
        static ArrayList arr = new ArrayList<inventory>();
        public static void main(String[] args) {
            System.out.println("-----------库存管理系统------------");
            System.out.println("欢迎使用库存管理系统!");
            Scanner sc = new Scanner(System.in);
            int index= 1;
            while (index == 1) {
                System.out.println("1.商品入库");
                System.out.println("2.商品显示");
                System.out.println("3.删除商品");
                System.out.println("4.退出管理");
                System.out.println("请输入你要使用的功能序号: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        add(arr);
                        show(arr);
                        break;
                    case 2:
                        show(arr);
                        break;
                    case 3:
                        show(arr);
                        delete(arr);
                        break;
                    case 4:
                        index = 0;
                        break;
                    default:
                        System.out.println("输入有误");
                        break;
                }
            }
            System.out.println("谢谢你的使用!!!");
        }
    public static void add(ArrayList arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("是否要录入商品");
        String choice = sc.next();
        if("Yes".equalsIgnoreCase(choice)||"yes".equalsIgnoreCase(choice)||"是".equals(choice)){
            System.out.println("请输入你要录入的商品的编号");
            String id = sc.next();
            System.out.println("请输入你要录入的商品的名称");
            String name = sc.next();
            System.out.println("请输入你要录入的商品的颜色");
            String color = sc.next();
            System.out.println("请输入你要录入的商品的价格");
            double price = sc.nextDouble();
            System.out.println("请输入你要录入的商品的数量");
            int number = sc.nextInt();
            arr.add(new inventory(id,name,color,price,number));
            System.out.println("入库成功!!!");
        }
        else
            return ;
    }
    private static void delete(ArrayList arr) {
        if (arr.isEmpty()) {
            System.out.println("暂无商品");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的商品编号");
        int index=sc.nextInt();
        arr.remove(index-1);
        System.out.println("删除成功!!!");
    }

    private static void show(ArrayList arr) {
        if (arr.isEmpty()) {
            System.out.println("暂无商品");
            return;
        } else {
            System.out.println("---------商品信息如下------------");
            for (Object obj : arr)
                System.out.println(obj);
            System.out.println("-------------------------------");
        }
    }

}



class inventory{

    private String id;
    private String name;
    private String color;
    private double price;
    private int number;

    public inventory() {
    }

    public inventory(String id, String name, String color, double price, int number) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String toString() {
        return "{" + "id=" + getId() + ",name=" + getName()+ ", color=" + getColor()  + ", price=" + getPrice() + "元"+ ", number=" + getNumber() +"件"+ "}";
    }
}
