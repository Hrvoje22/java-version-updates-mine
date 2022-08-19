package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,1,2,3,4);
        //list.forEach(x-> System.out.println(x));
        list.forEach(System.out::println);

        //OPERATIONS

        System.out.println("--------------------------------------------");

        //FILTER

        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);

        System.out.println("--------------------------------------------");

        //DISTINCT

        //longer way
        Stream<Integer> stream = list.stream()
                .filter(i->i%2==0)
                .distinct();

        stream.forEach(System.out::println); //stream closed

        System.out.println("--------------------------------------------");

        //TRUNCATING A STREAM

        //LIMIT(N)

        list.stream()
                .filter(i->i%2==0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("--------------------------------------------");

        //SKIP

        list.stream()
                .filter(i->i%2==0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("--------------------------------------------");


        //MAP

        list.stream()
                .map(number -> number*2)
                .filter(i-> i%3==0)
                .forEach(System.out::println);












    }
}
