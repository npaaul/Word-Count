package com.hewen.pta;

import java.util.Arrays;
import java.util.Scanner;

public class sevenSix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int flag=-1;
        int index=sc.nextInt();

        for (int i = 0; i < n; i++) {
            if(a[i]==index){
            flag=1+i;
            break;
            }
        }
        System.out.println(flag);
    }
}
