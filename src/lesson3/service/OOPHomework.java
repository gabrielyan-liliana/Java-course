package lesson3.service;

import lesson3.model.Employee;

public class OOPHomework {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.firstname = "FName";
        employee.lastname = "LName";
        employee.salary = 200;
        employee.email = "some@email.com";
        employee.yearOfBirth = 1995;
        employee.gender = 'f';


        System.out.println(employee.firstname);

        employee.introduceEmpolyee();
        System.out.println(employee.getBonus());
        employee.setBonus(5);
        System.out.println(employee.getBonus());
    }
}

