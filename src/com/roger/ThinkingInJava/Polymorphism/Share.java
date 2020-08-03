package com.roger.ThinkingInJava.Chapter8;

public class Share {
    private static long count=0;
    private final long id=count++;
    private int refCount=0;

    public Share() {
        System.out.println("create share id: "+id);
    }

    public void addRef(){
        refCount++;
    }

    public void dispose(){
        refCount--;
        if(refCount==0) {
            System.out.println("dispose share "+id);
        }
    }

    public static void main(String[] args) {
        Share share=new Share();
        Composing[] composings=new Composing[10];
        for(int i=0;i<10;i++){
            composings[i]=new Composing(share);
        }
        for(Composing c:composings){
            c.dispose();
        }
    }

}

class Composing{
    private Share share;
    private static long count=0;
    private final long id=count++;

    Composing(Share share){
        System.out.println("create composing "+id);
        this.share=share;
        share.addRef();
    }

    public void dispose(){
        System.out.println("dispose composing "+id);
        share.dispose();
    }
}

