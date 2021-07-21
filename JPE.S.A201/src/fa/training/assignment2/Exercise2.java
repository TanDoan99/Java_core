package fa.training.assignment2;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first number: ");
		 a=sc.nextInt();
		System.out.println("Input second number: ");
		 b=sc.nextInt();
		 System.out.println("Input third number: ");
		 c=sc.nextInt();
		 System.out.println("Input fourth number: ");
		 d=sc.nextInt();
		 if(a==b && c==d && b==c) {
			 System.out.println("Numbers are equal!");
		 }else {
		 System.out.println("Numbers are not equal!");
		 }
	}
}
