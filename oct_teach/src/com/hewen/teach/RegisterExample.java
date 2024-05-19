package com.hewen.teach;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.jar.Attributes;

public class RegisterExample {
    public static void main(String[] args) {
        HashSet hs= new HashSet();
        int num=0;
        Register r1=new Register("张三","123456");
        Register r2=new Register("李四","123457");
        hs.add(r1);
        num++;
        hs.add(r2);
        num++;
        System.out.println("欢迎注册~~~");
        num++;
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            Register r3=new Register(name,password);
            hs.add(r3);
            if(hs.size()==num){
                System.out.println("注册成功");
            }else{
                System.out.println("已重复注册，请重新注册！");
            }
        }
    }
}
class Register{
    String name;
    String password;

    public Register(String name,String password) {
        this.name = name;
        this.password=password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Register register = (Register) o;
        return Objects.equals(name, register.name) && Objects.equals(password, register.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,password);
    }
}