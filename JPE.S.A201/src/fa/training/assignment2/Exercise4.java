package fa.training.assignment2;

import java.util.Scanner;

public class Exercise4 {
	public static void CylinderComputation() {
		double radius,height,surfaceArea,baseArea,volume;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input radius: ");
		radius=sc.nextDouble();
		System.out.println("input height: ");
		height=sc.nextDouble();
		surfaceArea=2*Math.PI*radius*height;
		baseArea=2*Math.PI*radius*(height+radius);
		volume=Math.PI*radius*radius*height;
		System.out.println("surfaceArea: "+surfaceArea);
		System.out.println("baseArea: "+baseArea);
		System.out.println("volume: "+volume);
	}
	public static void main(String[] args) {
		CylinderComputation();
	}

}
