package fa.training.assignment3;

import java.util.Scanner;

public class SortAlgoritmBuble {
	public void sapXep(){
		Scanner sc = new Scanner(System.in);
		int n=0,i=0,j=0;
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
		System.out.print("Mảng ban đầu: ");
		for (int item : arr) {
			System.out.print( item+" ");
		}
		//Sap xep mang
		int temp=0;
		for ( i = 0; i < arr.length; i++) {
			for (  j= 0; j < arr.length; j++) {
				if(arr[j]>arr[i]){
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Mảng sau khi sắp xếp");
		for (int k : arr) {
			System.out.print(k+" ");
			
		}
	}
	
	public static void main(String args[]) {
		SortAlgoritmBuble sort=new SortAlgoritmBuble();
		sort.sapXep();

		
	}

}