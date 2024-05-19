package com.hewen.define;
//求和
public class array {
    public static void main(String[] args) {
        int[] money={16,26,36,6,100};
        int i;
        int sum=0;
        for ( i = 0; i < money.length; i++) {
            System.out.println(money[i]);
            sum+=money[i];
        }
        System.out.println(sum);
    }
}
