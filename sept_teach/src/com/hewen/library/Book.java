package com.hewen.library;

public class Book {
    private int id;
    private String name;
    private double price;
    private int remain;

    public Book() {
    }

    public Book(String name, int id, double price, int remain) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.remain = remain;
    }//**

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }
}
