package com.cydeo.task.task3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {

    private int employeeId;
    private String employeeName;
    private String employeeEmail;
    private List<String> employeePhoneNumbers;

}
