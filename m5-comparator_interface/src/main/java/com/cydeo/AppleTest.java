package com.cydeo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {

    public static void main(String[] args) {


        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(300,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));


        //Ascending
        Comparator<Apple> sortApple = Comparator.comparing((Apple apple) -> apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);

        //Comparator<Apple> sortApple2 = comparing(Apple::getWeight);
        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);

        //Descending
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        //CHAINING METHODS

        inventory.sort(comparing(Apple::getWeight).thenComparing(Apple::getColor));
        System.out.println(inventory);

    }
}




