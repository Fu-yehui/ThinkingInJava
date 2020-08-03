package com.roger.ThinkingInJava.Chapter11;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueTest {
    public static void main(String[] args) {
        Random random=new Random();
        PriorityQueue<Double> priorityQueue=new PriorityQueue<Double>();
        PriorityQueue<Double> priorityQueueReverse=new PriorityQueue<Double>(10, Collections.reverseOrder());
        for(int i=0;i<10;i++){
            Double d=random.nextDouble();
            priorityQueue.offer(d);
            priorityQueueReverse.offer(d);
        }


        while(priorityQueue.peek()!=null){
            System.out.print(priorityQueue.poll()+" ");
        }
        System.out.println();
        while(priorityQueueReverse.peek()!=null){
            System.out.print(priorityQueueReverse.poll()+" ");
        }



    }
}
