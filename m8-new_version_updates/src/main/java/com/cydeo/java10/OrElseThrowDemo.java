package com.cydeo.java10;

import java.util.Optional;

public class OrElseThrowDemo {

    public static void main(String[] args) {

        //replacement of the get()

        Optional<String> str = Optional.empty();


        System.out.println(str.get()); //gives an exception NOT GOOD ANYMORE

        if(str.isPresent()){
            System.out.println(str.get());
        }else{
            //exception handling
        }

        System.out.println("---------------------");

        //now

        System.out.println(str.orElseThrow());
        System.out.println(str.orElseThrow(()-> new RuntimeException()));

        //orElseThrow has isPresent and exception handling inside




    }
}
