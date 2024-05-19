
package com.hewen.teach;//throws 异常

public class demo6 {
/*    public static void main(String[] args)throws Exception {
        int result=divide(4,0);
        System.out.println(result);
    }
    public static int divide(int x,int y) throws Exception{
        int result=x/y;
        return result;
    }*//*
class  DivideByMinusException extends Exception{
        public DivideByMinusException(){
        super();
        }
      *//*  public DivideByMinusException(){
            super();
        }*//*
    }
}
public class example{
    public static void main(String[] args) {
        try{
            int result=divide(4,0);
            System.out.println(result);
        }
        catch (DivideByMinusException e){
            System.out.println(e.getMessage());
        }
    }
    public static int divide(int x,int y)throws DivideByMinusException{
        if(y<0)
            throw new DivideByMinusException("除数是负数");
        int result=x/y;
        return result;
    }*/
}