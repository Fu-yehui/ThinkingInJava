package com.roger.ThinkingInJava.Chapter11;

import java.util.Iterator;

/**
 * 任何实现了Iterable接口的类都可以用于foreach语句中
 *
 * 要实现iterator()方法
 *
 * 数组可以使用foreach语句，但是数组并不是一个Iterable。
 */
public class IterableClass implements Iterable<String> {
    private String[] words;

    public IterableClass(String[] words){
        this.words=words;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index;
            @Override
            public boolean hasNext() {
                return index<words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }

    public static void main(String[] args) {
        IterableClass iterableClass=new IterableClass("And that is how we know the Earth to be banana-shaped.".split(" "));
        for(String s:iterableClass){
            System.out.println(s);
        }
    }
}
