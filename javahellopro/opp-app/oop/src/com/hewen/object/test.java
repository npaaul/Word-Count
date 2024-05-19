package com.hewen.object;

import org.w3c.dom.ls.LSOutput;

public class test {
    public static void main(String[] args) {


        Student s1 = new Student("小黑",59);
//        s1.setName("小黑");
//        s1.setScore(99);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());

        studentOperator operator = new studentOperator(s1);
        operator.printpass();
    }
}