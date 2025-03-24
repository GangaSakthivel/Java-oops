

public class MainOne {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("12345", "John Doe", 1000.0);
        BankAccount b2 = new BankAccount("67890", "Jane Smith", 500.0);

        b1.deposit(200);
        b1.withdraw(100);

        b2.deposit(400);
        b2.withdraw(500);

        b1.display();
        b2.display();


    }
}