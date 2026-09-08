public class AccountManager {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.balance = 500;
        BankAccount acc2 = acc1;
        acc2.balance = 750;
        BankAccount acc3 = findAccount("missing-id");
        System.out.println("acc1 balance:" + acc1.balance);
        System.out.println("acc3 balance:" + acc3.balance);
    }
    public static BankAccount findAccount(String id) {
        return  null; // pretend this searched a database and found nothing
        
    }

    }
    
