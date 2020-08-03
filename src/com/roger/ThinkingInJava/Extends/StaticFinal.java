package com.roger.ThinkingInJava.Chapter7;

import java.util.Random;

/**
 * final数据
 * 1。一个永不改变的编译时常量  +static final在类加载时进行初始化，是 只有一份，不会改变的常量
 * 2。一个在运行时被初始化的值，你不希望改变它    +final  在实例化对象时进行的初始化，每个对象都有一个自己的final常量
 */
public class StaticFinal {
    public static Random random=new Random(47);
    public static final int VALUE_1=random.nextInt(20);//针对类的final常量
    public final int value_2=random.nextInt(20);//针对每个对象的final常量

    public static void main(String[] args){
        StaticFinal s1=new StaticFinal();
        StaticFinal s2=new StaticFinal();
        System.out.println("s1 static final :"+s1.VALUE_1);
        System.out.println("s2 static final :"+s2.VALUE_1);
        System.out.println("s1  final :"+s1.value_2);
        System.out.println("s2  final :"+s2.value_2);

    }


}
