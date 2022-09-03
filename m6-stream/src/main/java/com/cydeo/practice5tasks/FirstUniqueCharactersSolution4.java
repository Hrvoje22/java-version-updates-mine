package com.cydeo.practice5tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharactersSolution4 {

    public static void main(String[] args) {


        System.out.println(solutionWithStream("widow"));


    }

    public static char solutionWithStream(String str){

        Map<Character,Integer> frequencyMap = new LinkedHashMap<>();

        str.toLowerCase().chars()
                .mapToObj(i->(char)i).forEach(ch -> frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1));

        return frequencyMap.keySet().stream()
                .filter(ch -> frequencyMap.get(ch)==1).findFirst().orElse(' ');

    }
}
