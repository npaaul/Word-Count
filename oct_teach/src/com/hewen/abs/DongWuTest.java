package com.hewen.abs;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void shout();

    public abstract void eat(Food food);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }


    public void shout() {
        System.out.print("汪汪汪~~~");
    }

    public void eat(Food food) {
        System.out.println(super.getName() + "正在吃着香喷喷的" + food.getName());
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void shout() {
        System.out.print("喵喵喵~~~");
    }

    public void eat(Food food) {
        System.out.println(super.getName() + "正在吃着香喷喷的" + food.getName());
    }
}

interface Food {
    public abstract String getName();
}

class Bone implements Food {

    public String getName() {
        return "骨头";
    }
}

class Fish extends Animal implements Food {
    public Fish(String name) {
        super(name);
    }


    public void shout() {
        System.out.print("咕噜噜~~~");
    }

    public void eat(Food food) {
        System.out.println(super.getName() + "正在吃着香喷喷的" + food.getName());
    }
}

class Feeder {
    private String name;

    public Feeder(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("欢迎来到动物园！");
        System.out.println("我是饲养员，" + this.name);
    }

    public void feed(Animal a, Food food) {
        a.eat(food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class DongWuTest {
    public static void main(String[] args) {
        Feeder feeder = new Feeder("小华");
        feeder.speak();

        Animal cat = new Cat("小猫");   // 通过多态创建猫类对象
        cat.shout();
        Food food = new Fish("黄花鱼");   // 创建鱼类对象
        feeder.feed(cat,food);   // 通过对象调用wei方法

        Animal dog = new Dog("小黄狗");  // 创建狗类对象
        dog.shout();
        food = new Bone();
        feeder.feed(dog,food);
    }
}