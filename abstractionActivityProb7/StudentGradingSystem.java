package abstractionActivityProb7;

import java.util.Scanner;

public class StudentGradingSystem {

	public static void main(String[] args) {
		
		System.out.println("Adrian Louis C. Rosal\n" + 
				   "BSIT - 2B\n" +
				   "IT - OOPROG\n");
		System.out.println("Output: \n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 grades: ");
		
		double[] grades = new double[3];
		for (int i = 0; i < 3; i++) {
			grades[i] = sc.nextDouble();
		}
		
		GradingSystem gs = new StudentGrading();
		System.out.println("Average = " + gs.calculateAverage(grades));
     
		sc.close();
	}
}

