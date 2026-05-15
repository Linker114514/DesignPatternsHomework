package com.duck;

import com.duck.Duck;
import com.motion.FlyNoWay;
import com.motion.QuackZizi;


public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new QuackZizi();
        flyBehavior = new FlyNoWay();
    }
    public void display() {
        System.out.println("橡皮鸭上场了！");
    }
}