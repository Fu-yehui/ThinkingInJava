package com.roger.ThinkingInJava.Chapter11;

import java.util.Scanner;

public class Expression {

    public static void main(String[] args) {
        Stack stack=new Stack<Character>();
        Scanner scanner=new Scanner(System.in);
        String expression=scanner.nextLine();
        char[] e=expression.toCharArray();
        for(int i=0;i<e.length;){
            if(e[i]=='+'){
                stack.push(e[i+1]);
                i+=2;
            }else{
                System.out.println(stack.pop());
                i++;
            }
        }





    }
}
