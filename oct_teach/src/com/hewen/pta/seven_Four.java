package com.hewen.pta;

public class seven_Four {
    public static void main(String[] args) {
        Person p1=new Person("lili",19);
        Person p2=new Person("lucy",20);
        System.out.println("this person is "+ p1.getName()+",her age is"+ p1.getAge());
        System.out.println("this person is "+ p2.getName()+",her age is"+ p2.getAge());
    }
}
class Person{
    String  name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}