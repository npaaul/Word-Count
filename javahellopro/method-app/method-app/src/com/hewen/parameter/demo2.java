package com.hewen.parameter;

public class demo2 {
    public static void main(String[] args) {
        int[] arr1={10,20,30};
        int[] arr2={10,20,30};
        System.out.println(equals(arr1, arr2));
    }
    public static boolean equals(int[] arr1,int[] arr2){
        if(arr1==null&arr2==null) return true;
        if(arr1==null||arr2==null) return false;
        if(arr1.length!=arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {//arr[0]==10
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
}
