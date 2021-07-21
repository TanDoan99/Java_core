package fa.training.assignment3;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0,i=0,j=0,temp;
		// input length of array
		do {
			
			System.out.println("Enter the size of array");
			n =  Integer.parseInt(sc.nextLine());
		} while (n<0);
		
		
		int arr[] = new int[n];
		
		//input element in array
		for( i = 0; i < arr.length; i++ ) {
			System.out.println("Enter the element " + (i + 1) );
			arr[i] = sc.nextInt();
		}
		System.out.print("Original Array: ");
		for (int item : arr) {
			System.out.print( item+" ");
		}
		
        
        for( i = 0; i < arr.length / 2; i++)
        {
             temp = arr[i];
             arr[i] = arr[arr.length - i - 1];
             arr[arr.length - i - 1] = temp;
        }
        System.out.println();
        System.out.print("Reversed Array: ");
        for (int k : arr) {
			System.out.print(k+" ");
		}
	}
}
