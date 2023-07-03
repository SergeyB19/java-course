package com.zaurtregulov.collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Zaur");
        queue.offer("Oleg");
        queue.offer("Ivan");
        queue.offer("Mariya");
        queue.offer("Aleksandr");
        System.out.println("queue = " + queue);
        queue.remove("Ivan");
        System.out.println("queue = " + queue);
//        System.out.println("queue.remove() = " + queue.remove());
//        System.out.println("queue = " + queue);
//        System.out.println("queue.poll() = " + queue.poll());
//        System.out.println("queue.element() = " + queue.peek());
//        System.out.println("queue.poll() = " + queue.poll());
//        System.out.println("queue.element() = " + queue.peek());
//        System.out.println("queue.poll() = " + queue.poll());
//        System.out.println("queue.element() = " + queue.peek());
//        System.out.println("queue.poll() = " + queue.poll());
//        System.out.println("queue.element() = " + queue.peek());
//        System.out.println("queue.poll() = " + queue.poll());
//        System.out.println("queue.element() = " + queue.peek());
//        System.out.println("queue.poll() = " + queue.poll());
    }
}
