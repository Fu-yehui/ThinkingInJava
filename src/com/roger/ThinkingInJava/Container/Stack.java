package com.roger.ThinkingInJava.Chapter11;

import java.util.LinkedList;

/**
 * 使用LinkedList实现的栈
 */
public class Stack<T> {
    private LinkedList<T> storage=new LinkedList<T>();

    public void push(T v){
        storage.push(v);
    }

    public T peek(){
        return storage.peek();
    }

    public T pop(){
        return storage.pop();
    }

    public boolean isEmpty(){
        return storage.isEmpty();
    }

    @Override
    public String toString(){
        return storage.toString();
    }

    public int size(){
        return storage.size();
    }


    public static void main(String[] args) {
        Stack stack=new Stack<String>();
        for(String test:"my name is roger".split(" ")){
            stack.push(test);
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }


    }
}
