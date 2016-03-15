package com.cikai.stream;

import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.println("");

        // 等差数列
        Stream.iterate(0, n -> n + 3).limit(10).forEach(x -> System.out.print(x + " "));
        System.out.println("");

        // 平方数 2^2, 3^2, 4^2
        List<Integer> numList = Arrays.asList(1, 2, 3, 4);
        List<Integer> squareNums = numList.stream().map(n -> n * n).collect(Collectors.toList());
        for (int i : squareNums) {
            System.out.print(i + " ");
        }
        System.out.println("");

    }

}
