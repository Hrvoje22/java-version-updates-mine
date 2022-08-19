package com.cydeo.practice;

import java.util.function.Function;

public class Practice {

    public static void main(String[] args) {

        Function<Double,Double> f1= x->Math.sqrt(x);
        System.out.println( "SQRT from 100 is "+calculate(100d,f1) );

        Function<Integer,Double> f2=x->Math.sin(x);
        System.out.println("Sin from 30 is "+calculate(30,f2));

        System.out.println("\nThe same with Method Reference");
        Function<Double,Double> f3= Math::sqrt;
        System.out.println( "SQRT from 1000 is "+calculate(1000d,f3) );

        //Function<Integer,Double> f4= Math::sin;
        //System.out.println("Cos from 30 is "+calculate(30,f4));

        Function<Integer, Double> f4 = Math::cos;
        //System.out.println("Cos from 30 is " + calculate(30, f4));

        System.out.println("Sin from 30 is "+calculate(30d, Math::cos) );


    }
    private static<T, V extends Number> V  calculate(T num, Function<T,V> f1){
        return f1.apply(num);
    }

}
