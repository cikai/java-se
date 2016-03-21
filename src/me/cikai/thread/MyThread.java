package me.cikai.thread;

public class MyThread extends Thread {

    public void run() {

        String name = Thread.currentThread().getName();
        String info = Thread.currentThread().toString();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ",thread name==" + name + ",thread info==" + info);
        }
    }

}
