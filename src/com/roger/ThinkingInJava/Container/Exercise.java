package com.roger.ThinkingInJava.Chapter11;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise {
    public void method(){
        Queue<Command> queue=new LinkedList<Command>();
        for(int i=0;i<1000;i++){
            queue.offer(new Command());
        }
        new Depletion().deplete(queue);
    }

    class Depletion{
        public void deplete(Queue<Command> queue){
            while(queue.peek()!=null){
                queue.remove().operation();
            }
        }
    }


    public static void main(String[] args) {
      Exercise exercise=new Exercise();
      exercise.method();
    }


}

