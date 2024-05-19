package com.hewen.parameter;

public class demo1 {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};

        printarray(arr);

        //System.out.println("\n");
        int[] arr2=null;
        printarray(arr2);
    }
    public static void printarray(int[] arr){
        //int i=0;
        if(arr==null){
            System.out.println(arr);
            return;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length ; i++) {
//
//            if(i<arr.length-1) System.out.print(arr[i]+", ");
//            else System.out.print(arr[i]);
            System.out.print(i<arr.length-1 ? arr[i]+", ":arr[i]);
        }

        System.out.println("]");
    }
}
