package com.cydeo.task;


import com.cydeo.task.task2.Dish;
import com.cydeo.task.task2.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        //before

        int sum = 0;
        for(int number : numbers){
            sum = sum + number;
        }

        System.out.println(sum);

        //functional programming

        int result = numbers.stream().reduce(0,(a,b) -> a + b); // Integer::sum

        Optional<Integer> withoutInitialValue = numbers.stream().reduce((a,b) -> a + b);
        System.out.println(withoutInitialValue.get());


        System.out.println(result);

        System.out.println("Dish Calories total:");
        Optional<Integer> calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
                //.reduce((a,b)->a+b);
                .reduce(Integer::sum); //cleaner

        //or we can close it with get() without Optional container
        //if we don't give initial in this method it will take 0 as default
        System.out.println(calTotal);

        System.out.println("-------------------------------");

        //Max and Min

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum1 = numbers.stream().reduce(Integer::sum);

        System.out.println("Min: " + min.get());
        System.out.println("Max: " + max.get());
        System.out.println("Sum: " + sum1.get());











    }

}
