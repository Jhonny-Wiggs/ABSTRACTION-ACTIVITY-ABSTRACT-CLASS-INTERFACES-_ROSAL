package abstractionActivityProb6;

public class PhoneOrder implements Order{
	public void placeOrder(String itemName) {
        System.out.println("Phone order placed for: " + itemName);
    }
}
