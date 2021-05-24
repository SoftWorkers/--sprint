package com.wmw2;

public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("通过迭代器依次输出集合中所有狗狗的信息");
        dog.List();

        System.out.println("使用for each 循环打印所有狗狗的信息");
        dog.foreach();
    }
}
