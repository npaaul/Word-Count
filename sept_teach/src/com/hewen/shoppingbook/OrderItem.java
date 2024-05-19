package com.hewen.shoppingbook;

import com.hewen.library.Book;

public class OrderItem {
    private com.hewen.library.Book book;
    private int number;

    public OrderItem() {
    }

    public OrderItem(com.hewen.library.Book book, int number) {
        this.book = book;
        this.number = number;
    }

    public com.hewen.library.Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
