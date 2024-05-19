package com.hewen.library;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        /*
1、程序输出所有图书的信息，包括每本书的编号、书名、单价、库存。

2、顾客购书时，根据提示输入图书编号选购需要的书，并根据提示输入购买书的的数量(订单项）。

3、购买完毕后输出顾客的订单信息，包括订单号、订单明细、订单总额。
*/
            System.out.println(" 图书列表");
            System.out.println(" 图书名称 图书编号 图书单价 库存数量");
            System.out.println("--------------------------------------");
            Book[] books = new Book[3];
            books[0] = new Book("Java教程",1,  30.6, 30);
            books[1] = new Book("JSP教程",2, 42.1, 40);
            books[2] = new Book("SSH架构",3, 47.3, 40);
            for (int i = 0; i <= 2; i++) {
                System.out.println(books[i].getId() + " " + books[i].getName() + " " + books[i].getPrice() + " " + books[i].getRemain());
                System.out.println("--------------------------------------");
            }
            //int choice;
            int bookChoice,pnum;
            Scanner sc = new Scanner(System.in);
            System.out.println("如果你要购买图书请按1 退出请按2");
            int choice = sc.nextInt();
        while(choice==1) {
                if (choice == 1){
                    System.out.println("请输入图书编号选购需要的书");
                    bookChoice = sc.nextInt()-1;
                    System.out.println("请输入购买"+books[bookChoice].getName()+"的数量");
                    pnum = sc.nextInt();
                    System.out.println("购买成功!");
                    System.out.println("你购买了订单号为"+books[bookChoice].getId()+"的图书"+books[bookChoice].getName()+"共"+pnum+"本"+"订单金额: "+pnum*books[bookChoice].getPrice()+"元");
                    System.out.println("如果你要购买图书请按1 退出请按2");
                     choice = sc.nextInt();
                }
            }
            System.out.println("谢谢惠顾,欢迎下次光临!");
        }
    }
