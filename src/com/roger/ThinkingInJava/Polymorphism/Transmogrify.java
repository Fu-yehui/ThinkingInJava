package com.roger.ThinkingInJava.Chapter8;

import com.roger.ThinkingInJava.Chapter6.A;

/**
 * 继承表达行为上的差异：  改变方法的具体实现
 * 字段表达状态上的变化：  通过组合使状态发生变化
 *
 * 继承不能在运行期间决定继承不同的对象，在编译时就需要知道确切类型
 *
 * 组合更加灵活，可以动态的选择类型（类型不同，同时也可以改变行为）
 * 在运行期间动态的改变组合的类型：例如  Starship中的AlertStatus字段  可以动态改变为
 * AlertStatus类型  First类型  Second类型
 */
public class Transmogrify {
    public static void main(String[] args) {
        Starship s=new Starship();
        s.print();
        s.changeFirst();
        s.print();
        s.changeSecond();
        s.print();
    }
}


class Starship{
    private AlertStatus alertStatus=new AlertStatus();
    public void print(){
        alertStatus.print();
    }
    public void changeFirst(){
        alertStatus=new First();
    }

    public void changeSecond(){
        alertStatus=new Second();
    }
}

class AlertStatus{
    public void print(){
        System.out.println("alertstatus");

    }
}
class First extends  AlertStatus{
    @Override
    public void print(){
        System.out.println("first");
    }
}

class Second extends AlertStatus{
    @Override
    public void print(){
        System.out.println("second");
    }
}