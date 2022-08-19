package com.cydeo.task.task2;

public class DishTest {

    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories

        DishData.getAll().stream()
                .filter(dish->dish.getCalories()<400)
                .forEach(System.out::println);

        System.out.println("---------------------------");

        //Print the length of the name of each dish

        DishData.getAll().stream()
                .map(dish->dish.getName().length())
                .forEach(System.out::println);

        System.out.println("---------------------------");

        //Print three high caloric dish name(greater>300)

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("---------------------------");

        //Print all dish name that are below <400 calories in sorted

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)
                .sorted((o1,o2)->o1.compareTo(o2))
                .forEach(System.out::println);







    }


}
