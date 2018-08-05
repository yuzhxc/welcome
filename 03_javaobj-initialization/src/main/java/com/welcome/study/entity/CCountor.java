package com.welcome.study.entity;

public class CCountor {
    public static Integer num;

    static {
        num = 0;
        System.out.println("进入静态代码块");
    }
    {
        num++;
        System.out.println("进入构造代码块");
    }
    public CCountor() {
        System.out.println("进入构造方法");
    }

    public static void main(String[] args) {
        System.out.println(CCountor.num);

        new CCountor();

        System.out.println(CCountor.num);
    }
}
