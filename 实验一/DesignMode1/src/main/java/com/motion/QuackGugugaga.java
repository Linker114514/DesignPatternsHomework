package com.motion;
//咕咕嘎嘎的叫（假设鸭子就是这么叫的）
import com.behavior.QuackBehavior;

public class QuackGugugaga implements QuackBehavior{
    public void quack(){
        System.out.println("咕咕嘎嘎，咕咕嘎嘎，咕咕嘎嘎！！");
    }
}
