package abstractionActivityProb8;

public class ImagePrinter implements Printable{
	@Override
	public void print(String content) {
	    System.out.println("Printing image: " + content);
	}
}

