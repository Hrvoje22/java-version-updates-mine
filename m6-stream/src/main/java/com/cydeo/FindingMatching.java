package com.cydeo;

import com.cydeo.task.task2.Dish;
import com.cydeo.task.task2.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

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

        System.out.println("Find First");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        //System.out.println(dish); any
        System.out.println(dish.get());

        //Difference between FindAny vs FindFirst
        //Parallel Stream(Async) - action can happen randomly
        System.out.println(IntStream.range(0,100).parallel().findAny()); //not to see Optional we do .get();/in this case we need a variable
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        //example2

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

        Optional<String> findFirst = list1.parallelStream().filter(s->s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.parallelStream().filter(s->s.startsWith("J")).findAny();

        Optional<String> findFirst1 = list1.stream().filter(s->s.startsWith("D")).findFirst();
        Optional<String> findAny1= list2.stream().filter(s->s.startsWith("J")).findAny();

        System.out.println(findFirst.get()); //async
        System.out.println(findAny.get()); //async

        System.out.println(findFirst1.get()); //normalFlow of stream
        System.out.println(findAny1.get()); //normalFlow

        System.out.println("----------------------------------");

        System.out.println("Min and Max");

        Optional<Dish> dishMinimum = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories)); //we can go .sorted().findFirst();
        System.out.println(dishMinimum.get());

        Optional<Dish> dishMaximum = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dishMaximum);



    }



}
