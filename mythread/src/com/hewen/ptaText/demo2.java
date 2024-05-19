package com.hewen.ptaText;

import java.util.*;
import java.util.List;
public class demo2 {
        public static void main(String [] args) {
           ArrayList<Person> list = new ArrayList<Person>();
            //List list = new ArrayList();
            Scanner a = new Scanner(System.in);
            int n = a.nextInt();
            for(int i=0;i<n;i++) {
                String name1 = a.next();
                int age1 = a.nextInt();
                Person person  = new Person(name1,age1);
                list.add(person);
            }
            Iterator it = list.iterator();
            for(int i=0;i<list.size();i++) {
                System.out.println(list.get(i).toString());
            }
            String str= a.next();
            for(int i=0; i<list.size(); ++i) {
                if(((Person) list.get(i)).getName().equals(str)) {
                    System.out.println(list.get(i).toString());
                    break;
                }
                if(i==list.size()-1) {
                    System.out.println("此人不存在");
                }
            }
        }
    }
    class Person{
        private String name;
        private int age;
        public Person() {
        }
        public Person(String name,int age) {
            this.name = name;
            this.age = age;
        }
        public String toString() {
            return "Person [name="+this.name+", age="+age+"]";
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
    }

