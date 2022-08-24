package com.cydeo.task2;

import java.util.Arrays;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {

        State ny = new State();
        ny.addCity("New York City");
        ny.addCity("Albany");
        ny.addCity("Homer");
        ny.addCity("Buffalo");

        State al = new State();
        al.addCity("Anchorage");
        al.addCity("Fairbanks");
        al.addCity("Homer");
        al.addCity("Nome");

        List<State> list = Arrays.asList(ny,al);

        /*
        list.stream()
                .map(state -> state.getCities())
                .forEach(System.out::println);

         */

        list.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::print);



    }


}
