package com.duck;

import com.duck.Duck;
import com.motion.FlyWithWings;
import com.motion.QuackWawawa;


public class RedDuck extends Duck {
    public RedDuck() {
        quackBehavior = new QuackWawawa();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("红鸭上场了！");
    }
}