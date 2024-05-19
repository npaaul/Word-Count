package com.hewen.arraylist;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class jiekou {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        choice = input.nextInt();
        //以下为检查类体系的裁判代码
        //.....
        //以上为检查类体系的裁判代码

        int n = input.nextInt();//输入部件数量
        ComputePower[] parts = new ComputePower[n]; //创建部件数组
        //按部件类型号，对数组赋值
        int type;
        for (int i = 0; i < parts.length; i++) {
            type = input.nextInt(); //输入类型号
            if (type == 1)
                parts[i] = new Chip();//类型 1：芯片
            else if (type == 2)
                parts[i] = new Discrete();//类型 2：分离元件
        }
        Phone phone = new Phone(parts);//创建手机对象
        System.out.printf("手机的总功耗:%8.2f w", phone.getTotalPower());
    }
}

/* 请在这里填写答案 */

interface ComputePower {

    public /*abstract*/ double ComputePower();
}
class Chip implements ComputePower{
    public  double ComputePower(){
        return 16.6;
    }

}
class Discrete implements ComputePower{
    @Override
    public double ComputePower() {
        return 40.0;
    }
}
class Phone{
    private ComputePower[]  parts;

    public Phone(ComputePower[] parts) {
        this.parts = parts;
    }

    public double getTotalPower(){
        double sum=0;
        for (int i = 0; i < parts.length; i++) {
            sum +=parts[i].ComputePower();
        }
        return sum;
    }
}