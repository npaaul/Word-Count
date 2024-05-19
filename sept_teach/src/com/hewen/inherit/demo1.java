package com.hewen.inherit;

public class demo1 {
    public static void main(String[] args) {
        Dog dog=new Dog("牧羊犬",3);
/*        dog.setName("牧羊犬");
        dog.setAge(3);
        dog.setColour("棕色");*/
        System.out.println("名称："+dog.getName()+"  年龄："+dog.getAge()+"   颜色："+dog.getColour());
    }
}
class Animal{
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
        this.age = age;
    }
}
class Dog extends Animal{//狗继承动物  访问动物类里的所有内容
    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}