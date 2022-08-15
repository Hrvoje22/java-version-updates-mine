package com.cydeo;

public enum Currency {

    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

    //objects of the currency class
    //cannot be abstract - it's final


    private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
