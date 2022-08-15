package com.cydeo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //items.add("Apple");

        printDouble(items);

        System.out.println("-------------------------------------------");

        FootballPlayer fp = new FootballPlayer("Joe");
        BaseballPlayer bp = new BaseballPlayer("Pat");
        SoccerPlayer sp = new SoccerPlayer("David");

        Team<SoccerPlayer> team = new Team("Liverpool");
        //team.addPlayer(fp);
        //team.addPlayer(bp);
        team.addPlayer(sp);

    }

    private static void printDouble(ArrayList<Integer> items){

        for(Integer each : items){
            System.out.println(each*2);
        }


    }



}
