package com.roger.ThinkingInJava.Chapter10;

public class Outer {
    private  class Inner{
        public String describe;
        public Inner(String describe){
            this.describe=describe;
        }
        public void print(){
            System.out.println(describe);
        }
    }
    public Inner getInner(String describe){
        return new Inner(describe);
    }

    public static void main(String[] args) {
        Outer.Inner inner=new Outer().getInner("i am a inner class");
        inner.print();

    //    Outer.Inner a=new Outer.Inner("kjka");
    }
}
