package com.hewen.pta;

import java.util.Scanner;

public class seven_Six {
    public static void main(String[] args) {
        Student st=new Student();
        st.display();
        Scanner sc=new Scanner(System.in);
        String a =sc.next();
        st.setName(a);
        int b=sc.nextInt();
        st.setAge(b);
        st.display();


    }
}
class Student{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=6) age=7;
        else  this.age = age;
    }

    public Student() {
        name="无名";
        age=7;
        System.out.println("无参构造方法");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("name:"+getName()+", age:"+getAge());
    }
}