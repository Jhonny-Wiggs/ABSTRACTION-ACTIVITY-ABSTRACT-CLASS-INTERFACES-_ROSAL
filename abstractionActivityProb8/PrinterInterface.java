package abstractionActivityProb8;

import java.util.Scanner;

public class PrinterInterface {

	public static void main(String[] args) {
		
		System.out.println("Adrian Louis C. Rosal\n" + 
				   "BSIT - 2B\n" +
				   "IT - OOPROG\n");
		System.out.println("Output: \n");
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Choose printer (text/image): ");
        String type = sc.nextLine().toLowerCase();

        System.out.print("Enter content: ");
        String content = sc.nextLine();

        Printable printer = (type.equals("text")) ? new TextPrinter() : new ImagePrinter();
        printer.print(content);
        
        sc.close();
	}
}
