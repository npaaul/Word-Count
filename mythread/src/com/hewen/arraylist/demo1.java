package com.hewen.arraylist;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class demo1 {
    public static void main(String[] args) {
        HashSet hs=new HashSet<>();
        /*Student s1=new Student("1","张三");
        Student s2=new Student("2","李四");
        Student s3=new Student("2","李四");*/
        hs.add("s1");
        hs.add("s2");
        hs.add("s3");
        //System.out.println(hs);
        Iterator it= hs.iterator();
        while(it.hasNext()){
            Object o=it.next();
            System.out.println(o);
        }

    }
}
/*
class Student{
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id+":"+name;
    }

   */
/* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return id.hashCode();//返回di属性的哈希值
    }*//*

}
*/
