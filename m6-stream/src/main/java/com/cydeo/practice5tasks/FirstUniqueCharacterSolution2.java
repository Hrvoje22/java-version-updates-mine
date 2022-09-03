package com.cydeo.practice5tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterSolution2 {

    public static void main(String[] args) {


        System.out.println(solutionWithStream("success"));


    }

    public static char solutionWithStream(String str){

        Map<Character,Integer> frequencyMap = new LinkedHashMap<>();
        for (int i = 0; i<str.length(); i++){

            char ch = str.charAt(i);
            frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);

        }

        return frequencyMap.keySet().stream().filter(ch -> frequencyMap.get(ch) ==1).findFirst().orElse(' ');


    }


}

