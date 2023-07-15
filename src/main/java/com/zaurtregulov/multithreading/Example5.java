package com.zaurtregulov.multithreading;

public class Example5 {
    public static void main(String[] args) {
        Mythread5 myThread5 = new Mythread5();
        myThread5.setName("moy_potok");
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of myThread5 " + myThread5.getName() + " Prority of MyThread5 = " + myThread5.getPriority());
        Mythread5 myThread6 = new Mythread5();
        System.out.println("Name of myThread6 " + myThread6.getName() + " Prority of MyThread6 = " + myThread6.getPriority());
    }
}

class Mythread5 extends Thread {
    public void run() {
        System.out.println("privet");
    }
}

