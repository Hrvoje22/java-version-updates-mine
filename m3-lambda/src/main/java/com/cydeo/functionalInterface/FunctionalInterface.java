package com.cydeo.functionalInterface;

import com.cydeo.task.Apple;
import com.cydeo.task.ApplePredicate;

import java.util.function.Predicate;

public class FunctionalInterface {

    public static void main(String[] args) {

        //anonymous class
        //implementing right away - no with Lambda

        ApplePredicate ap = new ApplePredicate() { //AppleHeavyPredicate Class
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };

        System.out.println("------------------------------------------");

        //PREDICATE

        Predicate<Integer> lessThan = i -> i<18;
        System.out.println(lessThan.test(20));






    }

}
