package abstractionActivityProb7;

public class StudentGrading extends GradingSystem{
	double calculateAverage(double[] grades) {
        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.length;
    }
}
