package com.hewen.arraylist;
import java.util.*;
import java.util.HashMap;
//import java.util.Set;

public class demo3 {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put("1", "s1");
        map.put("2", "s2");
        map.put("3", "s3");
        // System.out.println(map.get("1"));

        /*Set keySet=map.keySet();
        Iterator it= keySet.iterator();
        while(it.hasNext()){
            Object key=it.next();//获取元素
            Object value=map.get(key);
            System.out.println(key+":"+value);
        }*/

        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry=(Map.Entry)(it.next());
            Object key = entry.getKey();//获取元素
            Object value = entry.getValue();//获取元素
            System.out.println(key + ":" + value);
        }
        System.out.println(map.size());
        System.out.println(map.containsKey("1"));
        System.out.println(map.containsValue("ss"));
        System.out.println(map.remove("1"));
        Collection values= map.values();
        Iterator iterator = values.iterator();
        while(iterator.hasNext()){
            Object value=iterator.next();
            System.out.println(value);
        }
    }
}
