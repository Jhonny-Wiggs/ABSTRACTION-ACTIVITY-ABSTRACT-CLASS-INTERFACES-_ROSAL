package abstractionActivityProb2;

public class FullTimeEmployee extends Employee{
	FullTimeEmployee(String name, double ratePerHour, int hoursWorked) {
        super(name, ratePerHour, hoursWorked);
    }
	
	@Override
    double calculatePay() {
        return ratePerHour * hoursWorked;
    }
}

