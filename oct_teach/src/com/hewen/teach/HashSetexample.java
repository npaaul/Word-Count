package com.hewen.teach;

import java.util.HashSet;
import java.util.Objects;

public class HashSetexample {
    public static void main(String[] args) {
        HashSet hs= new HashSet();
        Student stu1= new Student("1","张三");//student改register
        Student stu2= new Student("2","李四");
        Student stu3= new Student("2","李四");

        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        System.out.println(hs);
    }
}
class Student{
    String id;
    String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;//强转类型
        return Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}