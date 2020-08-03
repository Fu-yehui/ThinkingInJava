package com.roger.ThinkingInJava.Chapter7;

/**
 * 在构造器中对final常量进行赋值，使得每个对象都有自己的常量值，提供更大的灵活性
 */
public class BlankFinal {
    private final int i=0;//initialized final
    private final int j; //Blank final
    private final Poppet poppet;//Blank final reference

    //Blank final MUST be initialized in the constructor
    public BlankFinal(){
        j=1;//initialized blanl final
        poppet=new Poppet(1);//initialized blank final reference
    }
    public BlankFinal(int x){
        j=x;//initialized blanl final
        poppet=new Poppet(x);//initialized blank final reference
    }
    public static void  main(String[] args){
        BlankFinal b1=new BlankFinal();
        BlankFinal b2=new BlankFinal(9);
        System.out.println("b1中的常量j: "+b1.j);
        System.out.println("b2中的常量j: "+b2.j);
    }
}
class Poppet{
    private int i;
    public Poppet(int i){
        this.i=i;
    }
}