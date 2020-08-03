package com.roger.ThinkingInJava.Chapter8;

import java.util.Random;

public class Shapes {
    private static Random random=new Random(22 );
    public static Shape  next(){
        switch (random.nextInt(2)){
            case 0: return new Circle();
            case 1:return new Square();
            default :return new Shape();

        }
    }
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.draw();
        Shape c=new Circle();
        c.draw();
        c.print();

        System.out.println("-------------");
        Shape square=new Square();
        square.what();


        System.out.println("-0------------");
        Shape[] list=new Shape[5];
        for(int i=0;i<5;i++) {
           list[i]= Shapes.next();


        }

        for(Shape o:list){
        o.draw();
        o.f();

        }

        System.out.println("***************");
    Shape.main(args);
    }
}

class Shape{
    private int field=0;

    public void get(){
        System.out.println(field);
    }


    public void draw(){
        System.out.println("shape draw");
    }
    public void print(){
        System.out.println("shape print");
    }


    public String what() {
        return super.toString();
    }
    public void f(){
       this.g();
    }
    public void g(){
        System.out.println("shape g()");
    }

    private void pr(){
        System.out.println("shape private()");

    }

    public static void main(String[] args) {
        Shape s=new Square();
        s.pr();
        s.get();


    }
}

class Circle extends Shape{

    @Override
    public void draw(){
        System.out.println("circle draw");
    }

    @Override
    public void g(){
        System.out.println("cricle g()");
    }
}
class Square extends Shape{

    private int field=111;
    @Override
    public String what() {
        return super.toString();
    }
    @Override
    public void draw(){
        System.out.println("Square draw");
    }

    @Override
    public void g(){
        System.out.println("Square g()");
    }

    public void ns(){
        System.out.println("square new()");
    }

    public  void pr(){
        System.out.println("square pr()");
    }
    @Override
    public void get(){
        System.out.println(field);
    }
}