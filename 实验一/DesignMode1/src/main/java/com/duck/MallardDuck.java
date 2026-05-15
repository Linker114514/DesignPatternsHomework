package com.duck;
//野鸭
import com.duck.Duck;
import com.motion.FlyWithWings;
import com.motion.QuackGugugaga;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new QuackGugugaga();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("野鸭上场了！");
    }
}
