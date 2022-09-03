package com.cydeo.practice5tasks;

import java.util.Arrays;

public class FindMaxFromIntArray {

    public static void main(String[] args) {


        int[] array = {6,8,3,5,1,9};

        System.out.println(maxValueWithStream(array));

    }

    public static int maxValueWithStream(int[] array){
        return Arrays.stream(array).max().getAsInt();
    }


}
