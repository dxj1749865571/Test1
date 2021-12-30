package com.yj.yj_java1.entity;

public class User {
    public String username;
    public int password;

    public String getName() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    public void setName(String username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    @Override
    public String toString(){
        return "user{username = '"+username+"\'"+","+"password = "+ password +"}";
    }
}
