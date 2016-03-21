package me.cikai.thread;

public class MyRunnable implements Runnable {

    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(10);
                System.out.println(name + ":" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
