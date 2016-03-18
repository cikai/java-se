package me.cikai.snake;

import javax.swing.JFrame;

public class Snake {
    public static void main(String[] args) {
        JFrame frame = new JFrame("snake");
        WormPane pane = new WormPane();
        pane.repaint();
        frame.add(pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(300, 320);
        frame.setVisible(true);
    }

}
