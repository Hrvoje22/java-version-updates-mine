package com.cydeo.task.task3;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {


        System.out.println("Print All Emails");

        EmployeeData.readAll()
                //.map(employee -> employee.getEmployeeEmail())
                .map(Employee::getEmployeeEmail)
                .forEach(System.out::println);

        System.out.println("Print All Phone Numbers");

        EmployeeData.readAll()
                //.map(Employee::getEmployeePhoneNumbers) //Stream<List<String>> - we need to remove the stream
                .flatMap(employee -> employee.getEmployeePhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("Print All Phone Numbers with Double Color");

        EmployeeData.readAll()
                .map(Employee::getEmployeePhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
