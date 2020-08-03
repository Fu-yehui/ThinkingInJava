package com.roger.ThinkingInJava.Chapter7;

import java.util.Date;

/**
 * 将参数设为final ,则无法在方法中更改参数的值/将对象引用指向新的对象
 */
public class FinalArgs {

    public int f(final int i){
        return i+1;
    }

    /**

    public void f(final int i){
        i++;   //参数i无法在方法类改变
    }*/
    public void g(final Date date){
    //    date=new Date();  无法将对象引用指向新的对象
    }
}
