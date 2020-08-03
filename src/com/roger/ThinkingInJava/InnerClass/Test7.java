package com.roger.ThinkingInJava.Chapter10;

import Chapter5.Test;

public class Test7 {
    private String name;

    private class Inner{
        private String name="inner";
        /**
         * 修改外部类的private字段,并调用private方法
         * @param name
         */
        public void setOutName(String name){
            Test7.this.name=name;
            Test7.this.print();
        }
        private void f(){
            p();
            Test7.this.p();

        }

    }
    public Test7(String name){
        this.name=name;
    }
    private void print(){
        System.out.println("现在外部类的Name= "+Test7.this.name);
    }

    private void p(){
        System.out.println("现代调用的是："+this.name);

    }
    private void callF(){
        new Inner().f();
    }
    public void callInner(String name){
        new Inner().setOutName(name);
    }


    public static void main(String[] args) {
        Test7 test=new Test7("test");
        test.print();
        test.callInner("test7");
        test.p();
        test.callF();
    }
}
