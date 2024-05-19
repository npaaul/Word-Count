package com.hewen.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class demo2 {
    public static void main(String[] args) {
        ArrayList list =new ArrayList<>();
        list.add("s1");
        list.add("s2");
        list.add("s3");
        for (Object o:list
             ) {
            System.out.println(o);
        }
        Iterator it= list.iterator();
        while(it.hasNext()){
            Object o=it.next();
            System.out.println(o);
        }
        System.out.println(list.size());
        System.out.println(list.get(0));
    }
}
