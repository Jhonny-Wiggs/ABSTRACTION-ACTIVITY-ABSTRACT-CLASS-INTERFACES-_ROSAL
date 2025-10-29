package abstractionActivityProb1;

public class Circle extends Shape{
	double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.141592653589793 * radius * radius;
    }
}
