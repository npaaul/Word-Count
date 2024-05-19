package com.hewen.pta;

import java.util.Scanner;

public class sevenTwo {
    public static void main(String[] args) {
        int result;
        Scanner sc =new Scanner(System.in);
        int first=sc.nextInt();
        String symbol=sc.next();
        int second=sc.nextInt();
        switch(symbol){
            case "&":
                System.out.println(first+ " & " +second+ " = " +(first&second));
                break;
            case "|":
                System.out.println(first+ " | " +second+ " = " +(first|second));
                break;
            case "^":
                System.out.println(first+ " ^ " +second+ " = " +(first^second));
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
