package com.cikai.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java 8 Stream
 */
public class JavaStreamTest {

    public static void main(String[] args) {

        // 创建一个List
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ddd");

        Stream<String> stream = arrayList.stream();
        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list.toString());

        // 转换大写
        List<String> upperCase = arrayList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase.toString());

        // 留下偶数
        Integer[] nums = {1, 2, 3, 4, 5, 6};
        Integer[] evens = Stream.of(nums).filter(n -> n % 2 == 0).toArray(Integer[]::new);
        for (int i : evens) {
            System.out.print(i + " ");
        }

    }

}
