package fa.training.assignment2;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		int a,b,c,d,e,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first number: ");
		 a=sc.nextInt();
		System.out.println("Input second number: ");
		 b=sc.nextInt();
		 System.out.println("Input third number: ");
		 c=sc.nextInt();
		 System.out.println("Input fourth number: ");
		 d=sc.nextInt();
		 System.out.println("Input five number: ");
		 e=sc.nextInt();
		 sum=a+b+c+d+e;
		 System.out.println("The sum is "+sum);
	}
}
