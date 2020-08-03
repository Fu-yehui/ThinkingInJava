package com.roger.ThinkingInJava.Chapter7;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Date;

public class Demo extends parent{
    public int id;
    public Demo(String name,int id){
        super(name);   //编译器会将当前对象的引用当作隐性参数传过去
        this.id=id;
    }

    public static void main(String[] args){
        Demo demo=new Demo("roger",12);
        System.out.println(demo.name);
        //final Date date=new Date();
        //date=new Date();
        final int[] i={1,2,3,4};  //数组对象引用i无法指向另一个数组对象，但是，数组对象本身可以修改
       // i=new int[]{2,34,4};
        i[0]=99;



    }



}

class parent {
    public String name;
    public parent(String name){
        //name=name;   此时，demo的成员变量name值为null
        this.name=name;  //此时，this为子类Demo的对象引用，this.name指的是demo的name字段的值为roger
    }



}
