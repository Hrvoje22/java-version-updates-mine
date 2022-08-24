package com.cydeo.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.stream()
                .map(n-> n*n)
                .forEach(System.out::println);

        System.out.println("----------------------");


        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(3,4);

        numbers1.stream()
                .flatMap(i -> numbers2.stream().map(j -> new int[]{i,j}))
                .forEach(pair-> System.out.println(Arrays.toString(pair)));





    }


}
