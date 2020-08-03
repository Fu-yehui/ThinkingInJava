package com.roger.ThinkingInJava.Chapter8;


public class Sandwich extends Meal{
    private Bread d=new Bread();

    public Sandwich(){
        System.out.println("sandwich contructor");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}

class Meal{
    private Cheese c=new Cheese();

    public Meal(){
        System.out.println("meal contructor");
    }
}

class Bread{


    public Bread(){
        System.out.println("Bread contructor");
    }
}

class Cheese{


    public Cheese(){
        System.out.println("Cheese contructor");
    }
}