package com.cydeo;

import com.cydeo.task.task2.Dish;
import com.cydeo.task.task2.DishData;

import java.util.Optional;

public class FindingMatching {


    public static void main(String[] args) {

        System.out.println("All Match");

        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("Any Match");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("None Match");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println("Find Any");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        //System.out.println(dish); any
        System.out.println(dish.get());






    }



}
