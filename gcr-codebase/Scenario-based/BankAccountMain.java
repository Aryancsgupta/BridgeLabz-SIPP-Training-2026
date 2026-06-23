public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(101, "Aryan", 10000);
        BankAccount a2 = new BankAccount(102, "Rahul", 15000);
        BankAccount a3 = new BankAccount(103, "Priya", 20000);

       
        a1.deposit(2000);
        a1.withdraw(1000);
        a1.deposit(500);
        a1.withdraw(3000);
        a1.deposit(1000);

        a2.deposit(5000);
        a2.withdraw(2000);
        a2.deposit(1500);
        a2.withdraw(1000);
        a2.withdraw(500);

       
        a3.deposit(3000);
        a3.withdraw(4000);
        a3.deposit(2500);
        a3.withdraw(1000);
        a3.deposit(700);

        System.out.println("\n===== ACCOUNT STATEMENTS =====");
        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("\nTotal Accounts Created: "
                + BankAccount.getTotalAccounts());
    }
}