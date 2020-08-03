package com.roger.ThinkingInJava.Chapter11;

public class Command {
    private final int id=counter++;
    private static int counter=0;


    public void operation(){
        System.out.println(id);
    }
}
