package com.roger.ThinkingInJava.Chapter11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set hashSet=new  HashSet<Integer>();
        Set treeSet=new TreeSet<Integer>();
        Random random=new Random();
        for(int i=0;i<10000;i++){
            int j=random.nextInt(100);
            hashSet.add(j);
            treeSet.add(j);
        }
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(treeSet);
        System.out.println(treeSet.size());





    }
}
