package abstractionActivityProb4;

import java.util.Scanner;

public class PaymentGateway {

	public static void main(String[] args) {
		
		System.out.println("Adrian Louis C. Rosal\n" + 
				   "BSIT - 2B\n" +
				   "IT - OOPROG\n");
		System.out.println("Output: \n");
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Choose payment method (credit/gcash): ");
        String method = sc.nextLine().toLowerCase();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        Payment payment = (method.equals("credit")) ? new CreditCard() : new Gcash();
        payment.processPayment(amount);
        
        sc.close();
	}
}
