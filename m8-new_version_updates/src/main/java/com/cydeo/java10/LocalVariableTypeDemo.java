package com.cydeo.java10;

import java.util.Arrays;

public class LocalVariableTypeDemo {

    public static void main(String[] args) {

        //Type Inference
        //we can use var only for local variables


        var str = "Cydeo";
        var number = 5;

        byte x = 1;
        var y = 1; //int

        var numbers = Arrays.asList(3,4,5,6);

        var sum = 0;
        for(var eachNumber : numbers){
            sum = sum + eachNumber;
        }

        System.out.println("------------------");

        String s;
        s = "H";

        //var str; won't work

        //Var not with member variables/method parameters/return values








    }


}
