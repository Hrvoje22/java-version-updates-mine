package com.cydeo.practice5tasks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueCharactersSolution3 {

    public static void main(String[] args) {


        System.out.println(solutionWithStream("Success"));


    }

    public static char solutionWithStream(String str){

        Map<Character,Long> frequencyMap = str.toLowerCase().chars()
                .mapToObj(i->(char)i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        return frequencyMap.entrySet().stream()
                .filter(ch -> ch.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(' ');



    }


}
