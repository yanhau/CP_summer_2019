package Bank;

import java.math.BigDecimal;

public class PlayWithBank {

    public static void main(String[] args) {
        Bank bank = new Bank("MyBank");
        Customer c1 = bank.newCustomer("John", "Smith", "john@smith.com");
        Customer c2 = bank.newCustomer("Anne", "Brown", "anne@brown.com");

        Account a1 = bank.newCheckingAccount(c1, "EUR");
        Account a2 = bank.newSavingsAccount(c1, "EUR");

        Account a3 = bank.newCheckingAccount(c2, "EUR");

        System.out.println(bank);

        BigDecimal b = new BigDecimal(1330);
        BigDecimal c = BigDecimal.valueOf(456.5);
        b = b.add(c);
        System.out.println(b);
    }
}