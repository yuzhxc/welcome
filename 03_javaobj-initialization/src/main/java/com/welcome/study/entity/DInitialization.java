package com.welcome.study.entity;

public class DInitialization {
    public static void main(String[] args) {
        Child c = new Child();
    }

}
class Parent {

    {
        System.out.println("父类的非静态代码块被执行");
    }

    private PrintMessage b = new PrintMessage("父类非静态成员被初始化");

    public static PrintMessage a = new PrintMessage("父类静态成员被初始化");


    static{
        System.out.println("父类的静态代码块被执行");
    }
    public Parent(){
        System.out.println("父类的构造方法被执行");
    }
}

class Child extends Parent{
    public static PrintMessage a1 = new PrintMessage("子类静态成员被初始化");

    private PrintMessage b1 = new PrintMessage("子类非静态成员被初始化");

    static {
        System.out.println("子类的静态代码块被执行");
    }
    {
        System.out.println("子类的非静态代码块被执行");
    }
    public Child(){
        System.out.println("子类的构造函数被执行");
    }
}

class PrintMessage{
    public PrintMessage(String mes){
        System.out.println(mes);
    }
}
