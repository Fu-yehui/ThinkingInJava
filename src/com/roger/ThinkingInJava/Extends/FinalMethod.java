package com.roger.ThinkingInJava.Chapter7;

/**
 * final 方法是不允许覆盖的
 *
 */
public class FinalMethod extends Parent{
    /**
     * 此时，相当于一个新方法
     *
     */
    public  void f(){
        System.out.println("public f()");
    }

  /**  @Override
    public final void g(){
        System.out.println("protected g()");
    }
   */
    public static void main(String[] args){
        FinalMethod f=new FinalMethod();
        f.f();
        f.g();
    }
}
class Parent{
    /**
     * 超类中f()方法是private权限，对子类是不可见的，所以子类是无法覆盖f()方法的，加final意义不大
     *
     */
    private final  void f(){
        System.out.println("private f()");
    }

    protected final void g(){
        System.out.println("protected g()");
    }
}
