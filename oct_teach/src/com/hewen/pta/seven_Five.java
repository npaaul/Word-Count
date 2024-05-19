package com.hewen.pta;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class seven_Five {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        BankAccount c = new BankAccount(m);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int money=s.nextInt();
            switch (a) {
                case 1:
                    c.deposit(money);
                    break;
                case 2:
                    c.withdraw(money);
                    break;
                default:
                    break;
            }
            System.out.println(c.getBlance());
        }
    }
}
/* 请在这里填写答案 */
class BankAccount
{
    public int balance;

    public BankAccount()
    {
        this.balance=0;
    }
    public BankAccount(int _balance)
    {
        this.balance=_balance;
    }
    public  int getBlance()
    {
        return balance;
    }
    public int withdraw(int amount)
    {
        if(amount<=this.balance)
            this.balance -= amount;
        return this.balance;
    }
    public int deposit(int amount)
    {
        this.balance+=amount;
        return this.balance;
    }
}
/*public class seven_Five{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount ba = new BankAccount(sc.nextInt());
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    ba.deposit(sc.nextInt());
                    System.out.println(ba.getBlance());
                    break;

                case 2:
                    ba.withdraw(sc.nextInt());
                    System.out.println(ba.getBlance());
                    break;
                default:
                    break;
            }
        }
    }
}

class BankAccount {
    int balance; //账户余额

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBlance() {
        return balance;
    }

    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(int amount) {
        balance += amount;
    }

}


import java.util.Scanner;

public class seven_Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BookAccount ba =new BookAccount();
        int b=sc.nextInt();//余额
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            int index=sc.nextInt();//a
            int money=sc.nextInt();
            switch(index){
                case 1:
                    ba.deposit(money);
                    System.out.println(ba.getBalance());
                    break;
                case 2:
                    ba.withdraw(money);
                    System.out.println(ba.getBalance());
                    break;
            }
        }
    }
}
class BookAccount{
    int balance;//余额

    public BookAccount() {
        balance=0;
    }

    public BookAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public boolean withdraw(int amount){
        if(amount>balance) return false;
        else {
            balance -= amount;
            return  true;
        }
    }
    public void deposit(int amount){
        if(amount<0) return;
        else{
            balance= balance+amount;
        }
    }
}
*/
