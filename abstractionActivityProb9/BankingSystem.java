package abstractionActivityProb9;

import java.util.Scanner;

public class BankingSystem {

	public static void main(String[] args) {
		
		System.out.println("Adrian Louis C. Rosal\n" + 
				   "BSIT - 2B\n" +
				   "IT - OOPROG\n");
		System.out.println("Output: \n");
		
		Scanner sc = new Scanner(System.in);
        BankAccount account = new SavingsAccount();

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        account.deposit(dep);

        System.out.print("Enter withdraw amount: ");
        double wd = sc.nextDouble();
        account.withdraw(wd);

        sc.close();
	}

}
