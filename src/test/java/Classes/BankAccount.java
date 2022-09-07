package Classes;

public class BankAccount {
    private int number;
    private double cash = 0;

    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }

    public void depositCash(amount) {
    }
    if(amount >0)

    {
        this.cash = this.cash + amount;
    }

    public double withdrawCash(amount) {
    }
    if(amount <= this.cash)

    {
        this.cash = this.cash - amount;
    }


    public void String toString() {
    } return"Numer konta - "+this.number +" - "+ this.cash;
}
