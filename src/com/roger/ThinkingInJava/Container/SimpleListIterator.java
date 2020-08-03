package com.roger.ThinkingInJava.Chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * 只能用于各种List类的访问。
 *
 * 可以双向移动，得到当前位置的前一个和后一个元素的索引
 */
public class SimpleListIterator {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        System.out.println(list);
        List<Integer> copy=new ArrayList<>();
        ListIterator<Integer> lit=list.listIterator(list.size());
        while(lit.hasPrevious()){
            copy.add(lit.previous());
            lit.set(0);

        }
        System.out.println(list);
        System.out.println(copy);
   
    }
}
