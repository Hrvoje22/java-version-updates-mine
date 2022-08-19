package com.cydeo.task.task2;

import java.util.Comparator;

public class DishTest {

    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories

        DishData.getAll().stream()
                .filter(dish->dish.getCalories()<400)
                //.map(dish-> dish.getName())
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("---------------------------");

        //Print the length of the name of each dish

        DishData.getAll().stream()
                .map(dish->dish.getName().length())
                .forEach(System.out::println);
        
        /* OR
        DishData.getAll().stream()
        .map(Dish::getName)
        .map(String::length)
        .forEach(System.out::println);

        DishData.getAll().stream()
                .forEach(dish -> System.out.println(dish.getName().length()));

         */


        System.out.println("---------------------------");

        //Print three high caloric dish name(greater>300)

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("---------------------------");

        //Print all dish name that are below <400 calories in sorted

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);

        //map goes after sorted because we wouldn't be able to sort by calories if we only have Names!
        //with a container too. Stream<String> because we are getting a String getName









    }


}
