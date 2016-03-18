package me.cikai.snake;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Worm {

    private ArrayList<Node> list = new ArrayList<Node>();
    private ArrayList<Node> food = new ArrayList<Node>();
    public static final int UP = -10;
    public static final int DOWN = 10;
    public static final int LEFT = -1;
    public static final int RIGHT = 1;
    private boolean isHas = true;
    private int dir;
    private Random random = new Random();

    public Worm() {
        dir = UP;
        list.add(new Node(3, 9));
        list.add(new Node(4, 9));
        list.add(new Node(5, 9));
        list.add(new Node(5, 10));
        list.add(new Node(5, 11));
        list.add(new Node(6, 11));
        list.add(new Node(7, 11));
        addFood();
    }

    public Worm(ArrayList<Node> node, int dir) {
        node.clear();
        node.addAll(list);
        this.dir = dir;
    }

    public void step() {
        Node head = list.get(0);
        int i = head.getI() + dir / 10;
        int j = head.getJ() + dir % 10;
        head = new Node(i, j);
        list.add(0, head);
        isEat();
        if (isHas) {
            list.remove(list.size() - 1);
        }
        isHas = true;

    }

    public void step(int dir) {
        this.dir = dir;
        step();
    }

    public void isEat() {
        Iterator<Node> ite = food.iterator();
        while (ite.hasNext()) {
            Node n = ite.next();
            if (this.contains(n.getI(), n.getJ())) {
                isHas = false;
                ite.remove();
                System.out.println("worm:" + list.get(0).getI() + ":" + list.get(0).getJ());
                System.out.println("food:" + n.getI() + ":" + n.getJ());
            }
        }
        addFood();
    }

    public void addFood() {
        int x;
        int y;
        while (food.size() < 5) {
            x = random.nextInt(27) + 1;
            y = random.nextInt(27) + 1;
            if (this.contains(x, y)) {
                continue;
            } else
                food.add(0, new Node(x, y));
        }

    }

    public boolean contains(int i, int j) {
        for (int idx = 0; idx < list.size(); idx++) {
            Node node = list.get(idx);
            if (node.getI() == i && node.getJ() == j) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Node> getList() {
        return list;
    }

    public String toString() {
        return list.toString();
    }

    public ArrayList<Node> getFood() {
        return food;
    }
}
