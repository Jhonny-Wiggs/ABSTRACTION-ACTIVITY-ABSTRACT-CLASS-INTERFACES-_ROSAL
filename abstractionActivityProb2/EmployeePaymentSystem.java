package abstractionActivityProb2;

import java.util.Scanner;

public class EmployeePaymentSystem {

	public static void main(String[] args) {
		
		System.out.println("Adrian Louis C. Rosal\n" + 
				   "BSIT - 2B\n" +
				   "IT - OOPROG\n");
		System.out.println("Output: \n");
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee type (full/part): ");
        String type = sc.nextLine().toLowerCase();

        System.out.print("Enter name, rate per hour, and hours: ");
        String name = sc.next();
        double rate = sc.nextDouble();
        int hours = sc.nextInt();

        Employee emp = (type.equals("full")) 
            ? new FullTimeEmployee(name, rate, hours)
            : new PartTimeEmployee(name, rate, hours);

        System.out.printf("Pay: %.2f%n", emp.calculatePay());
        
        sc.close();
	}
}
