package me.cikai.collection;

import java.util.ArrayList;

public class CollectionDemo {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("test_1");
        arrayList.add("test_2");
        arrayList.add("test_3");
        arrayList.add("test_4");

        print(arrayList);
        print(arrayList.size());

        arrayList.remove("test_3");
        print(arrayList);

        Boolean b1 = arrayList.contains("test_3");
        print(b1);

        arrayList.clear();
        print(arrayList);

        Boolean b2 = arrayList.isEmpty();
        print(b2);

    }

    public static void print(Object obj) {
        System.out.println(obj);
    }

}
