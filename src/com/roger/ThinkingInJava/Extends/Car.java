package com.roger.ThinkingInJava.Chapter7;

/**
 * "is-a"（是一个）的关系是用继承来表达的  example:苹果是水果 ，苹果类可以继承至水果类
 * "has-a"(有一个）的关系则是用组合来表达的   example:猫有一个脑袋，一个身体，四个爪子，一条尾巴  ，cat class
 * 由一个head class 和 body class , paw class ,tail class组合而成
 */
public class Car {
    public Engine engine=new Engine();
    public Wheel[] wheels=new Wheel[4];
    public Door
              left=new Door(),
              right=new Door();
    public Car() {
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }
    public static void main(String[] args) {

            Car car=new Car();
            car.engine.service();
        }


}


class Engine{
    public void service(){
        System.out.println("engine is starting");
    }
}

class Wheel{

}
class Door{

}


