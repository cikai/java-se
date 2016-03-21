package me.cikai.thread;

public class ThreadTest {

    public static void main(String[] args) {

        MyRunnable r1 = new MyRunnable("A");
        Thread t1 = new Thread(r1);
        t1.start();

        MyRunnable r2 = new MyRunnable("B");
        Thread t2 = new Thread(r2);
        t2.start();

        MyThread myThread = new MyThread();
        Thread t3 = new Thread(myThread);
        Thread t4 = new Thread(myThread);

        t3.start();
        t4.start();

    }

}
