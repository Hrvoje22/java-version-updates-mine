package com.cydeo;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);


        //toCollection(Supplier) : use to create Collection using Collector

        List<Integer> numberList = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);





    }
}
