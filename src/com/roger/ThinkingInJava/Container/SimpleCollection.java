package com.roger.ThinkingInJava.Chapter11;

import java.util.*;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> list=new HashSet<Integer>();
        for(int i=0;i<10;i++){

            list.add(i);
        }
        for(int j:list){
            System.out.println(j);
        }
        list.add(10);
        list.add(9);


        for(int j:list){
            System.out.println(j);
        }
        System.out.println("------------------------");
        Collection<Integer> alist=new ArrayList<>();
        List<Integer> l= Arrays.asList(1,2,3,4);
     //   l.add(99);   l底层表示为数组，因此不能调整尺寸
        for(int j:l){
            System.out.println(j);
        }
        System.out.println("------------------------");
        alist.addAll(l);
        for(int j:alist){
            System.out.println(j);
        }
        System.out.println("------------------------");
        Collections.addAll(alist,5,6,7,8,9,10);
        for(int j:list){
            System.out.println(j);
        }
        System.out.println("------------------------");

        Object[] o=alist.toArray();
        for(Object j:o){
            System.out.println(j+" typeOf "+j.getClass().getName());
        }
        System.out.println("------------------------");
    }
}
