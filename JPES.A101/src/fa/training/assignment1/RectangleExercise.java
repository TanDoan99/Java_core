package fa.training.assignment1;

public class RectangleExercise {
	public static void main(String[] args) {
		double width = 5.5,height = 8.5;
		double area = width * height,perimeter=width+height;
		System.out.printf("Area is 5.5 * 8.5 = %.2f\n",area);
		System.out.printf("Perimeter is 2 * (5.5 + 8.5) = %.2f",perimeter);
	}
}
