package com.cydeo.task;

import com.cydeo.Sorting;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));


        List<Apple> heavyApple = filterApples(inventory,new AppleHeavyPredicate());
        System.out.println(heavyApple);
        List<Apple> greenApple = filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(greenApple);


        //lambda

                                //(no need for Apple - compiler knows)
        ApplePredicate weightApple = apple -> apple.getWeight()>200;
        System.out.println(filterApples(inventory, weightApple));

        // filterApples(inventory, apple -> apple.getWeight()>200);


    }

    private static List<Apple> filterApples(List<Apple> inventory,ApplePredicate applePredicate){


        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }

        return result;

    }



}
