package fa.training.assignment3;

import java.util.Scanner;

public class FrequentNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=0;
		//check element in array
		do {
		System.out.println("Enter a size of array: ");
		 n=sc.nextInt();
			
		} while (n<0);
		int[] array=new int[n];
		//input array
		for(int i = 0; i < array.length; i++ ) {
			System.out.println("Enter the element " + (i + 1) );
			array[i] = sc.nextInt();
		}
		//input element to check
				System.out.println("Enter the else you want to check");
				int check = sc.nextInt();

				int count = 0;

				String string = "";
				
				// count occurrences of element and find index 
				for (int i = 0; i < array.length; i++) {
					if (array[i] == check) {
						count++;
						string += i + " ";
					}
				}

				System.out.println("Amount of frequence: " + count);
				System.out.println("Index: " + string);
	}
}
