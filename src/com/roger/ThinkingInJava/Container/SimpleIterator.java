package com.roger.ThinkingInJava.Chapter11;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleIterator {
    public static void hop(Iterator<Gerbil> it){
        while(it.hasNext()){
            Gerbil gerbil=it.next();
            gerbil.hop();
            it.remove();
        }
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> list=new ArrayList<>();
        list.add(new Gerbil());
        list.add(new Gerbil());
        list.add(new Gerbil());
        System.out.println(list);
        SimpleIterator.hop(list.iterator());
        System.out.println(list);
    }
}
