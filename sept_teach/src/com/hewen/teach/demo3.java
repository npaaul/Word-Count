package com.hewen.teach;

public class demo3 {
    public static void main(String[] args) {
        phone p1=new phone("苹果","iphoneX","ios",8888,16);
        p1.Phonemessage();
        p1.autoDial("爷爷");
        p1.game("扫雷");
        p1.music("我的中国心");
        phone p2=new phone("华为","华为荣耀20","Android",6666,16);
        p2.Phonemessage();
        p2.autoDial("奶奶");
    }
}
class phone {
    private String name;
    private String type;
    private String os;
    private int price;
    private int memory;

    public phone() {
    }
    public phone(String name, String type, String os, int price, int memory) {
        this.name = name;
        this.type = type;
        this.os = os;
        this.price = price;
        this.memory = memory;
    }

    public void autoDial(String name) {
        System.out.println("使用自动拨号功能 : ");
        System.out.println(name+"的号");
    }
    public void game (String game){
        System.out.println("玩"+game+"游戏");
    }
    public void music (String music){
        System.out.println("播放歌曲 : "+music);
        System.out.println("********************");
    }
    public void Phonemessage(){
        System.out.println("品牌："+this.name);
        System.out.println("型号："+this.type);
        System.out.println("系统："+this.os);
        System.out.println("金额："+this.price);
        System.out.println("内存："+this.memory);
    }

}