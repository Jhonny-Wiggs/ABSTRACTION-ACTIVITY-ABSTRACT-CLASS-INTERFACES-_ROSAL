package abstractionActivityProb4;

public class CreditCard implements Payment{
	public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
