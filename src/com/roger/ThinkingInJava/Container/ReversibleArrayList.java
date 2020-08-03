package com.roger.ThinkingInJava.Chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ReversibleArrayList<T> extends ArrayList<T> {

    public ReversibleArrayList(Collection<T> c){
        super(c);
    }

    public Iterable<T> reversed(){
        return new Iterable<T>() {


            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    private int index=size()-1;
                    @Override
                    public boolean hasNext() {
                        return index>-1;
                    }

                    @Override
                    public T next() {
                        return  get(index--);
                    }
                };
            }
        };
    }


    public static void main(String[] args) {
        ReversibleArrayList<String> reversibleArrayList=new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));

        for(String s:reversibleArrayList){
            System.out.print(s+" ");
        }
        System.out.println();
        for(String s:reversibleArrayList.reversed()){
            System.out.print(s+" ");
        }
    }
}
