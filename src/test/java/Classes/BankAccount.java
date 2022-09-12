package Classes;

public class BankAccount {
    private int number;
    private double cash; //wartosc nastawiona na 0?


    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }

    public void depositCash(double amount) {
        try {
            if (amount > 0) {
                this.cash = this.cash + amount;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Podana wartość musi byc większa od 0");
        }
    }

    public double withdrawCash(double amount) {
        if (amount > 0) {
            try {
                if (amount <= this.cash) {
                    this.cash = this.cash - amount;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Podana wartość jest wyższa niż stan konta");
            }
        }
        return this.cash;
    }

    public String toString() {
        return "Stan konta nr: " + this.number + " wynosi: " + this.cash;
    }
}
