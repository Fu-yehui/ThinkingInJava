package com.roger.ThinkingInJava.Chapter10;

/**
 * 放入接口中的类自动是public +static
 */
public interface ClassInInterface {
    public void howdy();

    public static class Inner implements ClassInInterface{
        public Inner(){
            System.out.println("In Inner constructor");
        }
        @Override
        public void howdy(){
            System.out.println("将嵌套类置于接口中，并实现这个接口");
        }

        public static void print(ClassInInterface a){
            a.howdy();

        }
        public static void main(String[] args) {
            Inner inner=new Inner();
            inner.howdy();
        }
    }
}
