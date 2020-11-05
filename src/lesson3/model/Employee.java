package lesson3.model;
import java.util.Calendar;

public class Employee {
    public String firstname;
    public String lastname;
    public String email;
    public int yearOfBirth;
    public char gender;
    public int salary;
    private int bonus;

    public int getBonus() {
        return bonus > 0 ? bonus : this.salary * 2;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void introduceEmpolyee() {
        System.out.println("Name: " + this.firstname + " " + this.lastname);
        System.out.println("Email: " + this.email);
        System.out.println("Age " + (Calendar.getInstance().get(Calendar.YEAR) - this.yearOfBirth));
        System.out.println("Gender " + this.gender);
    }
}
