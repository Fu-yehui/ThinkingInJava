package com.roger.ThinkingInJava.Chapter12;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.io.IOException;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
//        int j;
//        try {
//            throw new SimpleException("this is an exception");
//        } catch (SimpleException ex) {
//            System.out.println(ex.getMessage());
//            System.out.println(ex.getLocalizedMessage());
//            ex.printStackTrace(System.out);
//        }finally{
//            System.out.println("in finally");
//        }

        int i=19;
        Random random=new Random();
        while(true){
            int r=random.nextInt(10000000);
            System.out.println(r); 
            try{
                if(i!=r){
                    throw new SimpleException("not is 19");
                }else{
                    break;
                }
            }catch (SimpleException ex) {

            }
        }

        System.out.println("调出循环");

    }
}


class SimpleException extends Exception{
    private String message;

    @Override
    public String getMessage(){
        return message;
    }
    public SimpleException(String message){
    //    super(message);
        this.message=message;
    }

}