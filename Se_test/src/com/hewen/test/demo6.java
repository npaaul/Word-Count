package com.hewen.test;

import java.util.Scanner;

public class demo6 {
    static String username[]=new String[5];//定义用户名数组
    static String password[]=new String[5];//定义密码数组

    static int idx=0;

    public static void main(String[] args) {
        username[0] = "xiaobin";
        password[0] = "123456";

        Scanner sc = new Scanner(System.in);
        boolean isFlag = true;
        while(isFlag) {
            printInf();

            System.out.println("请选择功能");
            int index=sc.nextInt();
            switch(index){
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    show();
                    break;
                case 4:

                    System.out.println("已退出该系统!");
                    isFlag=false;
                    break;
                default:
                    System.out.println("输入的号码有误，请重新输入！");
                    break;
            }
        }
    }

    public static void printInf()
    {
        System.out.println("----------------管理系统--------------------");
        System.out.println("1.登录功能（login）");
        System.out.println("2.注册功能（register）");
        System.out.println("3.查看（show）");
        System.out.println("4.退出（exit）");
        System.out.println("----------------管理系统--------------------");

    }
    public static void login(){
        Scanner sc=new Scanner(System.in);
        boolean isFlag=true;
        while(isFlag) {
            for(int i=0;i<username.length;i++){
                System.out.println("请输入用户名：");
                String name = sc.next();
                System.out.println("请输入密码：");
                String pass = sc.next();
                if(username[i].equals(name)&&password[i].equals(pass)){//****
                    System.out.println("登陆成功");
                    isFlag=false;
                    break;
                }
                else {
                    System.out.println("您输入的密码或账户错误，请重新输入");
                    break;
                }
            }
        }
    }
    public static void register(){
        Scanner sc= new Scanner(System.in);
        boolean isFlag=true;
        System.out.println("请输入用户名：");
        String name= sc.next();
        System.out.println("请输入密码：");
        String pass= sc.next();
        for (int i = 0; i < password.length; i++) {
            if(name.equals(username[i])) {
                System.out.println("用户名已存在");
                isFlag = false;
            }
        }//判断是否存在
        if(isFlag){
            idx++;
            if(idx< username.length){
                username[idx]=name;
                password[idx]=pass;
                System.out.println("注册完成");

            }
            else {
                expandArray();
                username[idx]=name;
                password[idx]=pass;
                System.out.println("注册完成");
            }
        }
    }

    private static void show(){
        for (int i = 0; i < username.length; i++) {
            if(username[i]!=null)
                System.out.println("用户名："+username[i]);
                System.out.println("密码："+password[i]);
        }
    }
    private static void expandArray(){
        String[] uarr = new String[username.length + 10];
        String[] parr = new String[password.length + 10];

        System.arraycopy(username, 0, uarr, 0, username.length);//arraycopy方法
        System.arraycopy(password, 0, parr, 0, password.length);

        username = uarr;
        password = parr;
    }
}
