package me.cikai.snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class WormPane extends JPanel {
    private Worm worm;
    private int width = 280;
    private int height = 280;
    public int l = 10;

    public WormPane() {
        worm = new Worm();
        WormEat eat = new WormEat();
        addKeyListener(eat);
        setFocusable(true);
    }

    private ArrayList<Node> list;
    private ArrayList<Node> foods;

    public void noHead() {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(0).equals(list.get(i))) {
                System.out.println("you shu le ");
            }
        }
    }

    ActionListener task = new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            worm.step();
            repaint();
        }
    };
    private Timer timer = new Timer(300, task);

    private class WormEat implements KeyListener {

        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                worm.step(Worm.LEFT);
            }
            else if (e.getKeyCode() == KeyEvent.VK_UP)
                worm.step(Worm.UP);
            else if (e.getKeyCode() == KeyEvent.VK_DOWN)
                worm.step(Worm.DOWN);
            else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                worm.step(Worm.RIGHT);
            timer.start();
            repaint();
        }

        public void keyReleased(KeyEvent e) {
        }

        public void keyTyped(KeyEvent e) {
        }
    }

    public WormPane(Worm worm) {
        this.worm = worm;
    }

    public Worm getWorm() {
        return worm;
    }

    public void paint(Graphics g) {
        list = worm.getList();
        foods = worm.getFood();
        g.setColor(Color.BLACK);
        g.fill3DRect(5, 5, width, height, false);
        g.setColor(Color.PINK);
        /*
         * for(int i=l;i<=width+l;i=i+l){ for(int j=l;j<=height+l;j=j+l){ g.drawLine(i, l, i, height); } } for(int
         * i=l;i<=width+l;i=i+l){ for(int j=l;j<=height+l;j=j+l){ g.drawLine(l, j, width, j); } }
         */
        for (Node n : list) {
            if (n.getI() >= 28) {
                n.setI(1);
            }
            if (n.getJ() >= 28) {
                n.setJ(1);
            }
            if (n.getI() <= 0) {
                n.setI(27);
            }
            if (n.getJ() <= 0)
                n.setJ(27);
            g.fillOval(n.getJ() * l, n.getI() * l, l, l);
            // System.out.print(n.getI()+":"+n.getJ()+"  ");
        }
        g.setColor(Color.GREEN);
        for (Node n : foods) {
            g.fillOval(n.getJ() * l, n.getI() * l, l, l);
        }
    }
}
