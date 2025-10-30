package abstractionActivityProb2;

public class PartTimeEmployee extends Employee{
	PartTimeEmployee(String name, double ratePerHour, int hoursWorked) {
        super(name, ratePerHour, hoursWorked);
    }

	@Override
    double calculatePay() {
        return ratePerHour * hoursWorked;
    }
}

