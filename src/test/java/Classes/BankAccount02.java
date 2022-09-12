package Classes;

import OOP.AccessModifier;

public class BankAccount02 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getCash());
        System.out.println(bankAccount.getNumber());
        System.out.println(bankAccount);
        System.out.println(bankAccount.withdrawCash(200000));

    }
}