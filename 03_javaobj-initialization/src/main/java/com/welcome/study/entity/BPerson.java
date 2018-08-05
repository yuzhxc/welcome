package com.welcome.study.entity;

import lombok.Data;

@Data
public class BPerson {
    private static int count = 0;

    {
        count++;
    }

    // 共性
    private int eyes;
    private int arms;
    // 特性
    private String name;
    private int age;
    // 构造代码块，初始化通用操作
    {
        eyes = 2;
        arms = 2;
    }

    /**
     * 不使用构造代码块前
     * @param eyes
     * @param arms
     * @param name
     * @param age
     */
    public BPerson(int eyes, int arms, String name, int age) {
        this.eyes = eyes;
        this.arms = arms;
        this.name = name;
        this.age = age;
    }

    public BPerson() {
        this("一般成年人",18);
    }

    /**
     * 使用构造代码块后
     * @param name
     * @param age
     */
    public BPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        new BPerson("张三", 20);
        new BPerson();
        new BPerson("李四", 30);
        new BPerson();
        System.out.println(count);
    }

}
