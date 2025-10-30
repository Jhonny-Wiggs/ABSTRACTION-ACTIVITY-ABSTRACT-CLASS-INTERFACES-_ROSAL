package abstractionActivityProb4;

public class Gcash implements Payment{
	@Override
	public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Gcash.");
    }
}

