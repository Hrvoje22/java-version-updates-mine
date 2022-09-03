package com.cydeo.practice5tasks;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfArrayElementsSolution2 {


    public static void main(String[] args) {

        String[] array = {"Apple","Banana","apple","Cherry","Apple",null};

        System.out.println(solutionWithStream(array));


    }

    public static Map<String,Long> solutionWithStream(String[] strings){

        return Arrays.stream(strings)
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


    }
}
