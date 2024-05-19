package com.hewen.test;

import java.util.Random;
import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        String namearr[]=new String[5];
        Scanner sc =new Scanner(System.in);

        System.out.println("----------------抽取幸运观众------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("存储的第"+ (i+1) +"个姓名：");
            String name=sc.next();
            namearr[i]=name;
           // System.out.println(namearr[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("第"+(i+1)+"个观众姓名："+namearr[i]);
        }
        Random r=new Random();
        int name =r.nextInt(3)+1;
        System.out.println(name);
       if(name==1) System.out.println("随机抽取的幸运观众为："+namearr[0]);
        else if(name==2) System.out.println("随机抽取的幸运观众为："+namearr[1]);
        else System.out.println("随机抽取的幸运观众为："+namearr[2]);
    }

}
