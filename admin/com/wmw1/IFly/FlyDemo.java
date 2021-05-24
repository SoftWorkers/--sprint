package com.wmw1.IFly;

public class FlyDemo {
    public static void main(String[]args){
        IFly bird = new Bird();
        IFly air = new Airplane();
        bird.fly();
        air.fly();
    }
}
