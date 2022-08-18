package com.cydeo;

import com.cydeo.task.Apple;
import com.cydeo.task.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class WithPredicate {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));


       Predicate<Apple> weight = apple -> apple.getWeight()>50;
       System.out.println(print(inventory, weight));

    }

    private static List<Apple> print(List<Apple> list,Predicate<Apple> a){

        List<Apple> result = new ArrayList<>();

        for (Apple each : list) {
            if(a.test(each)){
                result.add(each);
            }
        }

        return result;
    }
}
