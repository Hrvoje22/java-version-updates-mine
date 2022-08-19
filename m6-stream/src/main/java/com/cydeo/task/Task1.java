package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        //find the number of characters for each word

        words.stream()
                .map(str -> str.length())
                .forEach(System.out::println);



    }
}
