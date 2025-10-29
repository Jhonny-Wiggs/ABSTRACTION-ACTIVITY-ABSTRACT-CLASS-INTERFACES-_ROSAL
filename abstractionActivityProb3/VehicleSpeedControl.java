package abstractionActivityProb3;

import java.util.Scanner;

public class VehicleSpeedControl {

	public static void main(String[] args) {
		
		System.out.println("Adrian Louis C. Rosal\n" + 
				   "BSIT - 2B\n" +
				   "IT - OOPROG\n");
		System.out.println("Output: \n");
		
		Scanner sc = new Scanner(System.in);
        Vehicle car = new Car();

        car.start();
        System.out.print("Enter speed increment: ");
        int inc = sc.nextInt();
        car.speedUp(inc);
        
        sc.close();
	}
}
