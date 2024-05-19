package com.hewen.test;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        String name;
        System.out.println("请输入新员工的姓名：");
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        System.out.println("请输入新员工应聘的语言");
        String language=sc.next();
        switch(language) {
            case "java":
                System.out.println(name+"被分配到"+language+"程序开发部门");
                break;

            case "C#":
                System.out.println(name+"被分配到"+language+"程序开发部门");
                break;

            case "asp.net":
                System.out.println(name+"被分配到"+language+"程序测试部门");
                break;

            case "前端":
                System.out.println(name+"被分配到"+language+"程序开发部门");
                break;
        }
    }
}
