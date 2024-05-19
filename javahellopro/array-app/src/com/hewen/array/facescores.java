package com.hewen.define;
//找最大值
public class facescores {
    public static void main(String[] args) {
        int [] facescores={15,500,1000,2000,600,-5};
        int max=facescores[0];
        for (int i = 1; i < facescores.length; i++) {
            if(facescores[i]>max) max=facescores[i];
        }
        System.out.println(max);
    }
}
