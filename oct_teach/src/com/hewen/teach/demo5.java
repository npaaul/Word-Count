package com.hewen.teach;//finally

public class demo5 {
    public static void main(String[] args) {
        try{
            int result=divide(4,0);
            System.out.println(result);
        } catch (Exception e){
            System.out.println("被捕获的异常："+e.getMessage());
            return;//终止函数的调用
        }
        finally{//有异常  return 不妨碍finally的执行
            //切断内存访问 释放内存
            System.out.println("进入finally模块");
        }
    }
    public static int divide(int x,int y){
        int result=x/y;
        return result;
    }
}
