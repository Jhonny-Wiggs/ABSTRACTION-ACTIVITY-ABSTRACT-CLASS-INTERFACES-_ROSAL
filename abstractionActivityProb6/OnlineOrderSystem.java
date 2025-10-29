package abstractionActivityProb6;

import java.util.Scanner;

public class OnlineOrderSystem {

	public static void main(String[] args) {
		
		System.out.println("Adrian Louis C. Rosal\n" + 
				   "BSIT - 2B\n" +
				   "IT - OOPROG\n");
		System.out.println("Output: \n");
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Order type (online/phone): ");
        String type = sc.nextLine().toLowerCase();
        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        Order order = (type.equals("online")) ? new OnlineOrder() : new PhoneOrder();
        order.placeOrder(item);
        
        sc.close();
    }
}
