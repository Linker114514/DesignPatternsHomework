package com.motion;

import com.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior
{
    public void fly() {
        System.out.println("不好意思，俺不会飞.");
    }
}
