package Homework_20210524.detail_;

public class Cat extends Animal{
    public void eat(){//方法重写
        System.out.println("猫吃鱼...");
    }

    public void catchMouse(){//猫抓老鼠
        System.out.println("猫抓老鼠...");
    }
}
