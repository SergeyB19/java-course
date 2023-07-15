package com.zaurtregulov.collection.queue_interface;


import java.util.PriorityQueue;

public class PriorityQueueExample2 {
    public static void main(String[] args) {
        Student st1 = new Student("Zaur",5);
        Student st2 = new Student("Misha",1);
        Student st3 = new Student("Igor",2);
        Student st4 = new Student("Marina",3);
        Student st5 = new Student("Olya",4);
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);
        System.out.println("priorityQueue = " + priorityQueue);
        System.out.println("priorityQueue.poll() = " + priorityQueue.poll());
        System.out.println("priorityQueue.poll() = " + priorityQueue.poll());
        System.out.println("priorityQueue.poll() = " + priorityQueue.poll());
        System.out.println("priorityQueue.poll() = " + priorityQueue.poll());
        System.out.println("priorityQueue.poll() = " + priorityQueue.poll());
    }
}
