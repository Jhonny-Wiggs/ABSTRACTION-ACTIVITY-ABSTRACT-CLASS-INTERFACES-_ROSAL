package abstractionActivityProb1;

import java.util.Scanner;

public class ShapeAreaCalculator {

	public static void main(String[] args) {
		
		System.out.println("Adrian Louis C. Rosal\n" + 
				   "BSIT - 2B\n" +
				   "IT - OOPROG\n");
		System.out.println("Output: \n");
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter shape (circle/rectangle): ");
        String shapeType = sc.nextLine().toLowerCase();

        Shape shape;
        if (shapeType.equals("circle")) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            shape = new Circle(r);
        } else {
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter width: ");
            double w = sc.nextDouble();
            shape = new Rectangle(l, w);
        }

        System.out.println("Area = " + shape.calculateArea());
        
        sc.close();
    }
}
	
