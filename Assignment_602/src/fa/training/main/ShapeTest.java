package fa.training.main;

import java.util.Scanner;

import fa.training.entities.Rectangle;

public class ShapeTest {
	public static void DisplayMaxArea(Rectangle[] rectangles) {
		int max = rectangles[0].calculateArea();
		for (int i = 0; i < rectangles.length; i++) {
			if (rectangles[i].calculateArea() > max) {
				max=rectangles[i].calculateArea();
			}
		}
		for (int i = 0; i < rectangles.length; i++) {
			if (rectangles[i].calculateArea() == max) {
				System.out.println(rectangles[i]);
			}
		}
	}

	public static void DisplayMinPerimeter(Rectangle[] rectangles) {
		int min=rectangles[0].calculatePerimeter();
		for (int i = 0; i < rectangles.length; i++) {
			if(rectangles[i].calculatePerimeter()<min){
				min=rectangles[i].calculatePerimeter();
			}
		}
		for (int i = 0; i < rectangles.length; i++) {
			if (rectangles[i].calculatePerimeter() == min) {
				System.out.println(rectangles[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check;
		int n=0;
		// input length of array
		do {
			check=false;
			System.out.println("Enter the size of array");
			try {
						n =  Integer.parseInt(sc.nextLine());
						if (n < 0) {
							throw new NumberException("Lỗi vui lòng nhập n>0!!!");
						}
			} catch (NumberFormatException e) {
				System.out.println("Please input is number !!!");
				check=true;
			}catch (NumberException e) {
				System.out.println(e.getMessage());
				check=true;
			}
		} while (check);
		Rectangle[] rectangles = new Rectangle[n];

		for (int i = 0; i < rectangles.length; i++) {
			System.out.println("Enter value for rectangle " + (i + 1));
			rectangles[i] = new Rectangle();
			rectangles[i].input();
		}
		System.out.println("<<--Display the info: the length, width, perimeter and square of n rectangles-->>");
		for (Rectangle rectangle : rectangles) {
			System.out.println(rectangle);

		}
		System.out.println("<<--Display Information Maximum area of ​​5 rectangles-->> ");
		DisplayMaxArea(rectangles);
		System.out.println("<<--Information Minimum perimeter of ​​5 rectangles-->>");
		DisplayMinPerimeter(rectangles);

	}

}
