package com.roger.ThinkingInJava.Chapter10;



public class Parce19 {

    public Destination destination(final String dest){
        return new Destination("构造器"){

            public String label=dest;
            @Override
            public String readLabel(){
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parce19 parce=new Parce19();
        Destination dest=parce.destination("内部类");

        System.out.println(dest.label);
        System.out.println(dest.readLabel());
    }
}


class Destination{
    public Destination(String dest){
        this.label=dest;
    }
    public String label;

    public String readLabel(){
        return label;
    }
}