package com.roger.ThinkingInJava.Chapter10;

import org.omg.PortableInterceptor.INACTIVE;

public class Instance implements ClassInInterface {
    @Override
    public void howdy(){
        System.out.println("现在在instance的howdy方法中");

    }

    public void call(){
        Inner.print(this);
    }

    public static void main(String[] args) {
        Instance instance=new Instance();
        instance.call();
    }
}
