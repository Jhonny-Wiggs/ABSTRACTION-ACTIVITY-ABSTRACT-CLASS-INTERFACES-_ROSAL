package abstractionActivityProb8;

public class TextPrinter implements Printable{
	@Override
	public void print(String content) {
        System.out.println("Printing text: " + content);
    }
}

