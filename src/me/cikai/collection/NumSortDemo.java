package me.cikai.collection;

import java.util.ArrayList;
import java.util.Collections;

public class NumSortDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(0);
        list.add(1);
        list.add(6);

        System.out.println(list.toString());

        Collections.sort(list);

        System.out.println(list.toString());

    }

}
