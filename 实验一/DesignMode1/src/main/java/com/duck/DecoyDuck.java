package com.duck;

import com.duck.Duck;
import com.motion.FlyNoWay;
import com.motion.QuackNoSound;


public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new QuackNoSound();
        flyBehavior = new FlyNoWay();
    }
    public void display() {
        System.out.println("诱饵鸭上场了！");
    }
}