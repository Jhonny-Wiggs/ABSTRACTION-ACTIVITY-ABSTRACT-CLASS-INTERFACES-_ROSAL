package abstractionActivityProb2;

abstract class Employee {
	String name;
    double ratePerHour;
    int hoursWorked;

    Employee(String name, double ratePerHour, int hoursWorked) {
        this.name = name;
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    abstract double calculatePay();
}

