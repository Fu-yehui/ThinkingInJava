package com.roger.ThinkingInJava.Chapter10;

public class OtherInner {
    public  class InheritInner extends WithInner{
        public InheritInner(int i){
            System.out.println("InheritInner i: "+i);

        }
    }

    public static void main(String[] args) {
        OtherInner otherInner=new OtherInner();
        InheritInner inheritInner=otherInner.new InheritInner(2222);

    }
}
