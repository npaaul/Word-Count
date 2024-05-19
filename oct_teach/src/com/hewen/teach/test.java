package com.hewen.teach;

public class test {
    public static void main(String[] args) {
        manage s = new manage("张三", "北京市", "156", 8999.0, 6.1);
        s.salaryIncrease();
        System.out.println("[姓名: " + s.getName() + ",籍贯 :" + s.getAddress() + ",工号 :" + s.getId()+"]");
        System.out.println("工龄 :" + s.getAge() + ",工资 :" + s.getWage()+"元/月");
        manage s1 = new manage("李四", "上海市", "849", 12999.0, 12.5,4);
        s1.salaryIncrease("manage");
        System.out.println("[姓名: " + s1.getName() + ",籍贯 :" + s1.getAddress() + ",工号 :" + s1.getId()+"]");
        System.out.println("工龄 :" + s1.getAge() + ",工资 :" + s1.getWage()+"元/月");
    }
}


