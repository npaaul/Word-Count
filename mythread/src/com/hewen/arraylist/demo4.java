package com.hewen.arraylist;

public class demo4 {
    public static void main(String[] args) {
        try {
            int result = deivide(4, 2);
            System.out.println(result);
        } catch (Exception e) {
            //e.printStackTrace();false
            System.out.println(e.getMessage());///true
            return;//异常则结束 无“jixu”
        }finally {
            System.out.println("222");//不受影响 异常与否照样执行
        }
        System.out.println("jixu");
    }

    public static int deivide(int x,int y) {
        int result=x/y;
        return result;
    }
}