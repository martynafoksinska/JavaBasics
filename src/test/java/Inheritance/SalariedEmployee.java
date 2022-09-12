package Inheritance;

public class SalariedEmployee extends Employee {
    public SalariedEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    final static int hours = 190;

    public double calculatePayment() {
        double payment = this.hours * wage;
        return payment;
    }
}
