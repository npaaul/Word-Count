package com.hewen.teach;

import java.util.Scanner;

public class demo2 {
        public static void main(String[] args) {

            count c = new count(500);
            c.getMoney();
            c.deposit(1000);
            c.withdrawal(800);
        }
    }


    //只允许出现一次public
    class count {//类
         int money;

        public count() {//构造器
        }

        public count(int money) {
            this.money = money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public void deposit(int money){//存款
                if (money < 0) {
                    System.out.println("请输入正确金额!");
                } else {
                    this.money += money;
                    System.out.println("存入成功!存入金额" + money + "元!"+"您的余额是："+this.money);
                }
        }
        public void withdrawal(int money)
        {
            do{
                if (money < 0) {
                    System.out.println("请输入正确金额!");
                } else {
                    this.money -= money;
                    System.out.println("取款成功!取款金额" + money + "元!"+"您的余额是："+this.money);
                }
            }while(money<0);
        }

        public void getMoney() {
            System.out.println("账户金额: "+money+"元");
        }
    }