package com.roger.ThinkingInJava.Chapter10;

public class StaticInner {
    public void f(){
        System.out.println("outer unstatic method");
    }

    public Inner getInstance(){
        return new Inner();
    }
    public static void g(){
        System.out.println("outer static method");
    }

    /**
     * 嵌套类可以包含static方法和字段
     */
    public static class Inner{
        private static int count=0;
        private final int id=count++;

        public void call(){
           // StaticInner.this.g();   嵌套类与外部类之间没有联系，无法访问外部类的字段和方法
            System.out.println("inner id: "+id);
        }
    }

    public static void main(String[] args) {
        StaticInner outer=new StaticInner();
        //通过外部类创建内部类
        Inner inner1=outer.getInstance();
       // Inner inner2=outer.new Inner();  无法通过外部类对象创建内部类
        inner1.call();
        //直接创建内部类对象
        Inner inner2=new StaticInner.Inner();
        inner2.call();
    }
}
