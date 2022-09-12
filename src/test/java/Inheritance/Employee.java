package Inheritance;

public class Employee {

    public int id;
    public String firstName;
    public String lastName;
    public double wage;
    double percent;

    public Employee(int id, String firstName, String lastName, double wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    public double raiseWage(double percent) {
        if (percent > 0) {
            this.wage = this.wage * (1 + percent);
            return this.wage;
        }
        else {
            System.out.println("To nie jest podwyżka");
            return this.wage;
        }
    }
}
