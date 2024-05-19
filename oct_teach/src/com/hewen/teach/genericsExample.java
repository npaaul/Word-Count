package com.hewen.teach;

import java.util.ArrayList;

public class genericsExample {
    public static void main(String[] args) {
        ArrayList <Integer>list= new ArrayList<Integer>();//限制ArrayList集合只能存储Integer类型元素
        /*list.add("String");*///error
        list.add(1);
        list.add(2);
        for (Object obj:list) {
            String str=(String) obj;
        }
    }
}
