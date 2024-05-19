
package com.hewen.practice;

public class practice4 {
    public static void main(String[] args) {
        System.out.println("加密后的："+caculate(1983));

    }
    public static String caculate(int number){
        String code="";
        //拆分1983
        int[] numbers=split(number);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=(numbers[i]+5)%10;
        }
        reverse(numbers);//8346
        for (int i = 0; i < numbers.length; i++) {
            code += numbers[i];
        }
        return code;
    }

    public static int[] split(int number) {
        int[] numbers=new int[4];
        numbers[0]=number/1000;
        numbers[1]=number/100%10;
        numbers[2]=number/10%10;
        numbers[3]=number%1000;
        return numbers;
    }
    public static void reverse(int[] numbers){
        for (int i = 0,j=numbers.length-1; i < j; i++,j--) {
            int temp=numbers[j];
            numbers[j]=numbers[i];
            numbers[i]=temp;

        }
    }

}

