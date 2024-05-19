package com.hewen.test;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class test1 {
    public static void main(String[] args) {
        HashMap<Integer,String> pokerMap =new HashMap<>();//Map集合
        ArrayList<String> colours=new ArrayList<>();//花色集合
        ArrayList<String> numbers=new ArrayList<>();//数字集合
        Collections.addAll(colours, "♠" ,"♦","♥","♣");
        Collections.addAll(numbers, "3","4","5","6","7","8","9","10","J","Q","K","A","2");
        int cnt=1;
        pokerMap.put(cnt++,"大王");
        pokerMap.put(cnt++,"小王");
        for(String number:numbers){
            for(String colour:colours){
                String cardd= colour+number;
                pokerMap.put(cnt++,card);
            }
        }
        //洗牌
        Set<Integer> numberSet = pokerMap.keySet();
        ArrayList<Integer> numberList=new ArrayList<>();
        numberList.addAll(numberSet);

        Collections.shuffle(numberList);

        //3名玩家
        ArrayList<Integer> p1=new ArrayList<>();
        ArrayList<Integer> p2=new ArrayList<>();
        ArrayList<Integer> p3=new ArrayList<>();
/*底牌*/ ArrayList<Integer> dp=new ArrayList<>();


    //发牌
        for (int i = 0; i < numberList.size(); i++) {
             Integer no = numberList.get(i);
             if(i>=51) dp.add(no);
             else{
                 if(i%3==0) p1.add(no);
                 else if (i%3==1) p2.add(no);
                 else p3.add(no);
             }
            Collections.sort(p1);
            Collections.sort(p2);
            Collections.sort(p3);

        }
    }
}
