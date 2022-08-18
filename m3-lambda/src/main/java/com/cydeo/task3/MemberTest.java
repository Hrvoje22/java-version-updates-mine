package com.cydeo.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {

       Person p1 = new Person("Mike",21,Gender.MALE,"mike@gmail.com");
       Person p2 = new Person("Ozzy",25,Gender.MALE,"ozzy@gmail.com");
       Person p3 = new Person("Ally",28,Gender.FEMALE,"Ally@gmail.com");
       Person p4 = new Person("Diana",19,Gender.FEMALE,"diana@gmail.com");

       List<Person> personList = Arrays.asList(p1,p2,p3,p4);

       CheckMember cm = p -> p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge()<=25;

       print(personList,cm);

       //or

       print(personList,p -> p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge()<=25);





    }

    private static void print(List<Person> personList, CheckMember member){

        List<Person> result = new ArrayList<>();

        for(Person person : personList){
            if(member.test(person)){
                result.add(person);
            }
        }

        System.out.println(result);

    }

}
