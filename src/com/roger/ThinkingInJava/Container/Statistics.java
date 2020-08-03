package com.roger.ThinkingInJava.Chapter11;

import java.util.*;

public class Statistics {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

        Random random=new Random();
        for(int i=0;i<10000000;i++){
            int r=random.nextInt(20);
            Integer value=map.get(r);
            map.put(r,value==null?1:value+1);

        }

        System.out.println(map);
    }
}
