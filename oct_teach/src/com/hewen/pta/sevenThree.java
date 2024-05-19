package com.hewen.pta;

import java.util.Scanner;

public class sevenThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int int1, int2;
        int cs1=0,cs2=0;
        int max, min;
        int remainder;//余数
        while (sc.hasNext()) {
            remainder = 1;
            int1 = sc.nextInt();
            int2 = sc.nextInt();

            if (int1 > int2) {
                cs1=int1;
                cs2=int2;
            }else{
                cs1=int2;
                cs2=int1;
            }
                while (remainder != 0) {
                    remainder = cs1 % cs2;
                    cs1 = cs2;
                    cs2 = remainder;
                }
                min = cs1;
                max = int1 * int2 / min;
                System.out.println(+min + " " + max);

        }
    }
}