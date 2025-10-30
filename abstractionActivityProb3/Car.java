package abstractionActivityProb3;

public class Car implements Vehicle{
	int speed = 0;

	@Override
    public void start() {
        System.out.println("Car started.");
    }
	
	@Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Car speed: " + speed + " km/h");
    }
}

