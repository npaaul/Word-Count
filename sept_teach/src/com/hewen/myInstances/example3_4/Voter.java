package com.hewen.myInstances.example3_4;

import java.util.HashSet;
import java.util.Set;

public class Voter {
    private static int MAX_VOTERS = 100;
    private static int count;  // 投票次数
    private static Set<Voter> voterSet = new HashSet<Voter>();  // 存放已投过的学生
    private String name;
    private String advice;  // 投票意见

    public Voter(String name) {
        this.name = name;
    }

    // 投票
    public void vote(String advice) {
        if (count == MAX_VOTERS) {
            System.out.println("投票结束。");
            return;
        }

        if (!voterSet.contains(this)) {
            this.advice = advice;
            count++;
            voterSet.add(this);
            System.out.println(name + "已完成投票");
        } else {
            System.out.println(name + ", 一人仅能投票一次哦~");
        }
    }

    public static void show() {
        System.out.println("当前投票数：" + count);
        System.out.println("本次投票结果为：");
        for (Voter voter : voterSet) {
            System.out.println(voter.name + ", 意见：" + voter.advice);
        }
    }

    public static void main(String[] a) {
        Voter james = new Voter("James");
        Voter durant = new Voter("Durant");
        Voter curry = new Voter("Curry");

        james.vote("是");
        durant.vote("否");
        durant.vote("否");
        curry.vote("是");

        Voter.show();
    }
}

