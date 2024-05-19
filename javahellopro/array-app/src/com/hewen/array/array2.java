package com.hewen.define;
//交换顺序
public class array2 {
    public static void main(String[] args) {
        int arr1[]={10,20,30,40,50};
        //int arr2[]={};
        int temp;
        for (int i = 0,j=arr1.length-1; i < j; i++,j--) {
            temp=arr1[j];//temp==50
            arr1[j]=arr1[i];//arr2[0]==arr1[4]
            arr1[i]=temp;
        }
        for (int k = 0; k <arr1.length ; k++)
        System.out.print(arr1[k]+" ");
    }
}
