package com.roger.ThinkingInJava.Chapter11;

import com.roger.ThinkingInJava.Chapter6.C;

import java.util.Collection;
import java.util.Iterator;

public class CollectionSequence {
    private Gerbil[] gerbils=new Gerbil[8];

    public CollectionSequence(){
        for(int i=0;i<8;i++){
            gerbils[i]=new Gerbil();
        }
    }

    public Iterator<Gerbil> iterator(){
        return new Iterator<Gerbil>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<gerbils.length;
            }

            @Override
            public Gerbil next() {
                return gerbils[index++];
            }
        };
    }

    public static void main(String[] args) {
        CollectionSequence collectionSequence=new CollectionSequence();
        Iterator<Gerbil> iterator=collectionSequence.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
