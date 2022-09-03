package com.cydeo.practice5tasks;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindFactorial {


    public static void main(String[] args) {

        System.out.println(solutionWithStream(4));

    }

    public static int solutionWithStream(int n){
        return
                /*
                IntStream.range(1,n+1)   //returns IntStream
                        .boxed()         //stream of  elements each boxed to an Integer
                        .collect(Collectors.toList()) //list of elements
                        .stream()   //returns a stream with this colletion
                        .reduce(1,(x,y)->x*y)
                        .intValue();

                 */

        IntStream.range(1,n+1)
                .reduce((x,y)->x*y)
                .orElseThrow();


    }



}
