package fa.training.entities;

import java.util.Scanner;

public class Rectangle implements Shape{
	private int length;
	private int width;
	public Rectangle() {
		
	}
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	public int getlength() {
		return length;
	}
	public void setlength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public int calculatePerimeter() {
		
		return (length+width)*2;
	}
	@Override
	public int calculateArea() {
		
		return (length*width);
	}
	@Override
	public void setLengthWidth(int len, int width) {
		setlength(len);
		setWidth(width);
	}
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width +", calculatePerimeter()=" + calculatePerimeter() + ", calculateArea()=" + calculateArea()
				+ ", getLength()=" + getLength() + "]";
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		boolean check;
		
		do {
			check = false;
			System.out.println("Enter the length: ");
			
			try {
				length = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("enter the number");
				check = true;
			}
			
		} while (check);
		
		do {
			check = false;
			System.out.println("Enter the width: ");
			
			try {
				width = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("enter the number");
				check = true;
			}
			
		} while (check);
	}
	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return length;
	}
	
}
