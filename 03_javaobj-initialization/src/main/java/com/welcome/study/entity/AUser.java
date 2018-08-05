package com.welcome.study.entity;

import lombok.Data;

@Data
public class AUser {
    private String name;
    private int age;

    public AUser() {
    }

    public AUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        new AUser();
    }
}
