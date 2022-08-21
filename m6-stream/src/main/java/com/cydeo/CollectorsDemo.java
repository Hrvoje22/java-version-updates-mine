package com.cydeo;

import com.cydeo.task.task2.Dish;
import com.cydeo.task.task2.DishData;

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

        //toList() : returns a Collector interface that gathers the input data into a new List

        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        //toSet() : returns a Collector interface that gathers the input data into a new Set

        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        //toMap(Function,Function) : returns a Collector interface that gathers the input data into a new map

        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        //summingInt(ToIntFunction) : returns a Collector that produces the sum of a Integer - valued function
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);









    }
}
