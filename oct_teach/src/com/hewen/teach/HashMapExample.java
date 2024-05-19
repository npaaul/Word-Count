package com.hewen.teach;
import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("1", "zhangsan");
        map.put("2", "李四");
        map.put("3", "wangwu");
        /*System.out.println("1:" + map.get("1"));
        System.out.println("2:" + map.get("2"));
        System.out.println("3:" + map.get("3"));
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(key+":"+value);
        }*/
        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) (it.next());
            Object key = it.next();//获取Entry中的键
            Object value = map.get(key);//获取Entry中的值
            System.out.println(key+":"+value);
        }
    }
}