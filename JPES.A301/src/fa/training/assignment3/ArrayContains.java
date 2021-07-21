package fa.training.assignment3;

import java.util.Scanner;

public class ArrayContains {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		// input length of array
		do {
			
			System.out.println("Enter the size of array");
			n =  Integer.parseInt(sc.nextLine());
		} while (n<0);
		
		
		String arr[] = new String[n];
		
		//input element in array
		for(int i = 0; i < arr.length; i++ ) {
			System.out.println("Enter the element " + (i + 1) );
			arr[i] = sc.nextLine();
		}
		
		//display element in array
		System.out.print("element in array: ");
		for (String e : arr) {
			System.out.print(e+" ");
		}
		
		//input element to check
		System.out.println();
		System.out.println("Enter the element you want to check");
		String checkString = sc.nextLine();
		
		boolean flag = false ;
		
		//return if Contained
		for (String e : arr) {
			if(checkString.equals(e)) {
				System.out.println("Contained");
				flag = true;
				break;				
			}
		}
		
		//return if not contained
		if(!flag) {
			System.out.println("No contain");
		}
	}
}
