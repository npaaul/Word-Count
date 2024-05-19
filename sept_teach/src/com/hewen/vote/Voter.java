package com.hewen.vote;
import java.util.HashSet;
import java.util.Set;
public class Voter {
    public static void main(String[] args) {
        Voter v1=new Voter("Tom");
        Voter v2=new Voter("Jack");
        Voter v3=new Voter("Jone");
        v1.vote("是");
        v2.vote("否");
        v3.vote("是");
        Voter.show();

    }
    private static final int MAX_COUNT = 100;    // 最大投票数群知识库
    private static int count;//投票数
    private String name;
    private String answer;
    private static Set<Voter> voters = new HashSet<Voter>();//  静态变量，存放已经投票的学生

    public Voter(String name) {
        this.name = name;
    }

    public void vote(String answer){
        if(count==MAX_COUNT){
            System.out.println("投票结束");
            return;
        }
        if(!voters.contains(this)){//没投票
            this.answer=answer;
            count++;
            voters.add(this);
            System.out.println(name+"已完成投票");
        }
        else{//投票次数大于0
            System.out.println("一个人只能头一次票");
        }
    }
    public static void show(){
        System.out.println("当前投票数："+count);
        System.out.println("本次投票结果：");
        for(Voter voter: voters){
            System.out.println(voter.name+" 意见："+voter.answer);
        }

    }

}