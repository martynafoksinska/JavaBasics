package Inheritance;

public class HourlyEmployee extends Employee {

    public HourlyEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);

    }

    public double calculatePayment(int hours) {
        double payment = hours * wage;
        return payment;
    }
}