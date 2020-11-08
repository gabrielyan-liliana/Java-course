package lesson3.main;

import lesson3.model.Employee;

public class OOPHomework {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstname("FName");
        employee.setLastname("LName");
        employee.setSalary(200);
        employee.setEmail("some@email.com");
        employee.setYearOfBirth(1995);
        employee.setGender('f');


        System.out.println(employee.getFirstname());

        System.out.println(employee.getBonus());
        employee.setBonus(5);
        System.out.println(employee.getBonus());

        System.out.println(employee.getAge());

    }
}

