package com.hewen.pta;


import java.util.Scanner;
public class sevenFive{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        for(int i=str.length()-1;i>=0;i--) {
            int A=str.charAt(i);//?
            if(A<48||A>57) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
/*

import java.util.ArrayList;
import java.util.Scanner;

public class sevenFive {
    public static void main(String[] args) {
        //String arr[]=new String[]{"he11ll00o w0or8ld!"};
        Scanner sc=new Scanner(System.in);
        ArrayList<String> array=new ArrayList<>();
        String s=sc.nextLine();//输入字符串
        char ch[]=s.toCharArray();
        String s1[]=new String[s.length()];
        int flag=0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>='0'&&ch[i]<='9')
                ch[i]='0';
            s1[i]=String.valueOf(ch[i]);//*****
            if(s1[i].charAt(0)!='0'){
                array.add(s1[i]);
                flag++;//****
            }
        }
        for (int i = flag-1; i >= 0; i--) {
            System.out.print(array.get(i));
        }

    }
}
*/
