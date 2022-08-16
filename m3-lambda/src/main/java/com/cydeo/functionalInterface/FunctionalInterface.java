package com.cydeo.functionalInterface;

import com.cydeo.task.Apple;
import com.cydeo.task.ApplePredicate;

import java.util.function.*;

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

        // PREDICATE

        Predicate<Integer> lessThan = i -> i<18;
        System.out.println(lessThan.test(20));

        // CONSUMER

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);


        // BI CONSUMER

        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(2,3);

        // FUNCTION

        Function<String,String> function = s -> "Hello " + s;
        System.out.println(function.apply("Cydeo"));

        // BI FUNCTION

        BiFunction<Integer,Integer,Integer> biFunction = (x1,x2) -> x1+x2;
        System.out.println(biFunction.apply(2,3));

        // SUPPLIER

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());


    }

}
