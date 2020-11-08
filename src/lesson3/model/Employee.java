package lesson3.model;
import java.util.Calendar;

public class Employee {
    private String firstname;
    private String lastname;
    private String email;
    private int yearOfBirth;
    private char gender;
    private int salary;
    private double bonus;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus > 0 ? bonus : this.salary * 2;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - this.yearOfBirth;
    }
}
