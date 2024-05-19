package com.hewen.teach;

public class demo1 {
    public static void main(String[] args) {
        Student stu =new Student();
        stu.setName("张三");
        stu.setAge(18);
        stu.read();
    }
}
class Student{
    private   String name;
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
        if(age<=0){
            System.out.println("你输入的年龄有误");
        }else this.age = age;
    }

    public void read(){
        System.out.println("大家好，我叫"+name+",我今年"+age+"岁");
    }
}