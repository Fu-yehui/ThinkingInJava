package com.roger.ThinkingInJava.Chapter10;

public class PartInner{

    /**
     * 在该方法中定义一个局部内部类并返回引用
     * 在该方法外，无法访问到这个局部内部类
     * @return
     */
    public PartInterface f(){
        class Inner implements PartInterface{
            public Inner(){

            }

            @Override
            public void g(){

            }
        }


        return new Inner();
    }

    public static void main(String[] args) {
        PartInner part=new PartInner();
        part.f();
    }
}


interface PartInterface{
    public void g();
}