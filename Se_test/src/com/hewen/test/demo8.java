package com.hewen.test;

public class demo8 {
    public static void main(String[] args) {
        int arr[]=new int[]{22,24,76,12,21,33};
        int max=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
    }
}
