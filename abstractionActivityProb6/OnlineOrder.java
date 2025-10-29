package abstractionActivityProb6;

public class OnlineOrder implements Order{
	public void placeOrder(String itemName) {
        System.out.println("Online order placed for: " + itemName);
    }
}
