package abstractionActivityProb9;

public class SavingsAccount implements BankAccount{
	double balance = 0;
	@Override
    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Deposited: %.2f, Balance: %.2f%n", amount, balance);
    }
	@Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew: %.2f, Balance: %.2f%n", amount, balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

