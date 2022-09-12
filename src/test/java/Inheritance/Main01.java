package Inheritance;

public class Main01 {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Jan", "Kowalski", 100);
        Employee employee2 = new Employee(2, "Krzysztof", "Nowak", 150);
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee(3,"Marcin", "Kałuski", 180);
        SalariedEmployee salariedEmployee1 = new SalariedEmployee(4, "Jakub", "Mickiewicz", 100);

        double raisedWage1 = employee1.raiseWage(0.10);
        double raisedWage2 = employee2.raiseWage(0.20);
        double raisedWage3 = hourlyEmployee1.raiseWage(0.30);
        double raisedWage4 = salariedEmployee1.raiseWage(0.10);

        System.out.println(raisedWage1 + " " + raisedWage2);
        System.out.println("Marcin zarabia teraz: " + raisedWage3);
        System.out.println(raisedWage4);
        System.out.println("Jakub zarabia " + salariedEmployee1.calculatePayment());
    }
}
