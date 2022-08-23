package com.cydeo;

//import com.cydeo.java9.FactoryMethodDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {


        List<Integer> number = Arrays.asList(2,4,2,10,23);

        //empty - isPresent();


        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());

        System.out.println(Optional.of(number).isPresent());


        //Optional - protect us from NullPointer Exception


        //ifPresent
        Optional<Integer> bigNumber = number.stream()
                .filter(x->x>100)
                .findAny();
        bigNumber.ifPresent(System.out::println); //prints nothing


        //get

        //System.out.println(bigNumber.get()); //no value present

        //orElse

        System.out.println(bigNumber.orElse(5));

        System.out.println("--------------------------------");

        //example with modules
        //accessing only java9 packages from m8 module

        //FactoryMethodDemo f1 = new FactoryMethodDemo();






    }
}
