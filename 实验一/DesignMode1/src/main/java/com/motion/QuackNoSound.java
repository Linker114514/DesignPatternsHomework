package com.motion;
//不会叫
import com.behavior.QuackBehavior;

public class QuackNoSound implements QuackBehavior{
    public void quack(){
        System.out.println("(心里默默想：我不会叫！)");
    }
}
