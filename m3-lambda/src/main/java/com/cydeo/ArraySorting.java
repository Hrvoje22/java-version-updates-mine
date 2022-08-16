package com.cydeo;

public class ArraySorting {

    public static void main(String[] args) {


        ArraySorting as = new ArraySorting();


        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();


        as.sort(qs);
        as.sort(bs);

        //lambda

        Sorting quickSort = () -> System.out.println("Quick Sorting");
        as.sort(quickSort);

        as.sort(() -> System.out.println("Quick Sorting"));

        //with this we skipped usage of BubbleSort & QuickSort class

    }

    private void sort(Sorting sorting){
        sorting.sort();
    }


}
