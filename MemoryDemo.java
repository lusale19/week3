public class MemoryDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.balance = 500;

        int balance = 1000;
        int copy = balance;
        copy = 500;
        System.out.println("balance: " + balance);
        System.out.println("copy: " + copy);

        BankAccount acc1 = new BankAccount();
        acc1.balance = 1000;
        BankAccount acc2 = acc1;
        acc2.balance = 500;
        System.out.println("acc1: " + acc1.balance);
        System.out.println("acc2: " + acc2.balance);

        // Apply bonus to account
        applyBonusToAccount(myAccount);
        System.out.println("myAccount: " + myAccount.balance);

        // Apply bonus to primitive
        int cash = 500;
        applyBonusToAmount(cash);
        System.out.println("cash: " + cash);

        // Safe handling of acc3
        BankAccount acc3 = null;
        if (acc3 != null) {
            System.out.println(acc3.balance);
        } else {
            System.out.println("acc3 is null, cannot access balance.");
        }
    } // end main

    public static void applyBonusToAccount(BankAccount acc) {
        acc.balance = acc.balance + 100;
    }

    public static void applyBonusToAmount(int amount) {
        amount = amount + 100;
    }
}

class BankAccount {
    int balance;
}