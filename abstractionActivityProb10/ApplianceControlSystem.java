package abstractionActivityProb10;

import java.util.Scanner;

public class ApplianceControlSystem {

	public static void main(String[] args) {
		
		System.out.println("Adrian Louis C. Rosal\n" + 
				   "BSIT - 2B\n" +
				   "IT - OOPROG\n");
		System.out.println("Output: \n");
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Choose appliance (fan/light): ");
        String type = sc.nextLine().toLowerCase();

        Appliance appliance = (type.equals("fan")) ? new Fan() : new Light();
        appliance.turnOn();
        appliance.turnOff();
        
        sc.close();
	}

}
