package me.cikai.loop;

import java.util.ArrayList;
import java.util.List;

public class ForTest {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        int arr[] = new int[5];

        for (int num : arr) {
            num = 10;
        }

        System.out.println(arr[0]);

        List<String> list = new ArrayList<String>();
        list.add("test_1");

        for(String str : list) {
            str = "test_2";
        }

        System.out.println(list.get(0));

    }

}
