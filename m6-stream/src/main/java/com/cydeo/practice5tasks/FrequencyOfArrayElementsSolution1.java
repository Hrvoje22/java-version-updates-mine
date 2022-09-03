package com.cydeo.practice5tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FrequencyOfArrayElementsSolution1 {

    public static void main(String[] args) {

        String[] array = {"Apple","Banana","apple","Cherry","Apple"};


        System.out.println(solutionWithStream(array));

    }

    public static Map<String,Integer> solutionWithStream(String[] strings){

        Map<String,Integer> map = new HashMap<>();

        Arrays.stream(strings)
                .filter(Objects::nonNull)
                .distinct()
                .forEach(e->map.put(e,(int)Arrays.stream(strings).filter(p->p!=null && p.equals(e)).count()));

        return map;


    }


}
