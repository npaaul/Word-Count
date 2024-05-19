package com.hewen.teach;

public class demo1_2 {
        public static void main(String[] args) {
            dog d = new dog("牧羊犬",5,"黑色");
            System.out.println(d.info());
            d.shout();
        }
    }
    class Animal {
        private String name;
        private int age;
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

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
        void shout(){
            System.out.println("动物在叫!");
        }
        public String info(){
            return "犬种:"+getName()+",年龄:"+getAge();
        }
    }
    class dog extends com.hewen.teach.Animal {
        private String color;
        public dog(String name, int age ,String color) {
            super(name, age);
            setColor(color);
        }
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public String info(){
            return super.info()+",颜色:"+getColor();
        }
        public void shout(){
            super.shout();
            System.out.println("狗在汪汪的叫!");
        }
    }
