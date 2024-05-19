package com.hewen.Log;

import java.io.Serializable;

public class Person implements Serializable {
    private String username;
    private String password;
    private String identity;//区分管理员和VIP用户

    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getIdentity() {
        return identity;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }
}