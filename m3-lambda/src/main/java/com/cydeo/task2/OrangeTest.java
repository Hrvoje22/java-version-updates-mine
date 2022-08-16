package com.cydeo.task2;

import com.cydeo.task.Apple;
import com.cydeo.task.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {


    public static void main(String[] args) {


        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, com.cydeo.task2.Color.GREEN));
        inventory.add(new Orange(100, com.cydeo.task2.Color.RED));
        inventory.add(new Orange(200, com.cydeo.task2.Color.GREEN));
        inventory.add(new Orange(50, com.cydeo.task2.Color.RED));

        //lambda

        OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight() + "g";
        prettyPrintOrange(inventory,orangeLambda);


        System.out.println("--------------------------------------------------------");

        //or

        prettyPrintOrange(inventory,orange -> "An orange of " + orange.getWeight() + "g");



    }


    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter orangeFormatter){

        for(Orange orange : inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }

    }
}
