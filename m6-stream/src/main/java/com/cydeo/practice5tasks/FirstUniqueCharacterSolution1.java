package com.cydeo.practice5tasks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstUniqueCharacterSolution1 {


    public static void main(String[] args) {


        System.out.println(solutionWithStream("success"));


    }


    public static char solutionWithStream(String str){

        //LinkedHashMap since has insertion order

        LinkedHashMap<Character,Integer> frequencyMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);
            frequencyMap.put(currentChar,frequencyMap.getOrDefault(currentChar,0)+1);
        }

        Optional<Map.Entry<Character,Integer>> opt =
                frequencyMap.entrySet()
                        .stream()
                        .filter(p->p.getValue()==1)
                        .findFirst();

        if(opt.isPresent())
            return opt.get().getKey();

        return ' ';


    }


}
