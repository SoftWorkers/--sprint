package com.wmw1.Animal;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        bird.setType("鸟");
        bird.setColor("红色");
        bird.setAge(4);
        bird.info();
        Animal fish = new Fish();
        fish.setType("鱼");
        fish.setWeight(5);
        fish.setAge(2);
        fish.info();
    }
}
