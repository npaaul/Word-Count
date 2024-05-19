package com.hewen.practice;

import java.util.Random;

public class practice2 {
    public static void main(String[] args) {
        System.out.println(creatcode(100));
    }
    public static String creatcode(int n){
        Random r=new Random();
        String code= "";
        //创建一个for循环构造n位的验证码
        for (int i = 1; i <=n ; i++) {
            int type=r.nextInt(3);
            switch(type){
                case 0:
                    code += r.nextInt(10);//生成0-9的数字
                    break;
                case 1:
                    code += (char)(r.nextInt(26) + 65);
                    break;
                case 2:
                    code += (char)(r.nextInt(26) + 97);
                    break;
            }
        }
        return code;
    }
}
