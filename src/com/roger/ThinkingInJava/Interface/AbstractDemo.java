package com.roger.ThinkingInJava.Chapter9;

import com.roger.ThinkingInJava.Chapter6.A;

public abstract class AbstractDemo {
    public abstract void print();
    public AbstractDemo(){
        print();
    }

    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.print();
        AbstractDemo a=new Demo();
        a.print();

    }
}

class Demo extends AbstractDemo{
    private int i=1;
    @Override
    public void print(){
        System.out.println(i);
    }
}
