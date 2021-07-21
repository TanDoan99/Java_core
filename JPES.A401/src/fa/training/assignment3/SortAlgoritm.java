package fa.training.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class SortAlgoritm {
	
	public int[] merge(int[] arr1,int[] arr2){
		int n=arr1.length + arr2.length;
		int[] result= new int[n];
		
		
		int i = 0, i1 = 0, i2 = 0;
		while (i<n) {
			if(i1<arr1.length && i2<arr2.length){//arr1 va arr2 !=rong
				if(arr1[i1]<=arr2[i2]){//arr1 nho hon
					result[i] = arr1[i1];
					i++;i1++;
				}else{//arr2 nho hon
					result[i]=arr2[i2];
					i++;i2++;
				}
			}else{//arr1 rong hoac arr2 rong
				if(i1<arr1.length){//arr1 != rong
					result[i] = arr1[i1];
					i++;i1++;
				}else{//arr2 !=rong
					result[i]=arr2[i2];
					i++;i2++;
				}
			}
		}
		return result;
	}
	
	public int[] mergeSort(int arr[],int L,int R){
		//truong hop dac biet
		if(L>R){
			return new int[0];
		}
		if(L==R){
			int[] singleElement={arr[L]}; 
			return singleElement;
		}
		
		//chia ra
//		System.out.println("Chia: "+L+" - "+R);
		int k=(L+R)/2;
		int[] arr1 = mergeSort(arr, L, k);
		
		int[] arr2 = mergeSort(arr,k+1, R);
		//tron vao arr1 va arr2 da duoc sap xep
		int[] result = merge(arr1, arr2);
//		System.out.println("Ket qua merge: "+ Arrays.toString(result));
		return result;
	}
	public int[] sortArray(int[] nums){
		return mergeSort(nums,0,nums.length-1);
	}
	public static void main(String[] args) {
		SortAlgoritm s = new SortAlgoritm();
//		int[] a={1,2,5,7,9};
//		int[] b={3,6,8};
//		int[]cb={3,8,9,5,6,4,3,1};
//		System.out.println(Arrays.toString(s.merge(a, b)));
//		System.out.println(Arrays.toString(s.mergeSort(cb, 0, cb.length-1)));
		Scanner sc = new Scanner(System.in);
		int n=0,i=0,j=0;
		// input length of array
		do {
			
			System.out.println("Nhap do dai mang can sap xep: ");
			n =  Integer.parseInt(sc.nextLine());
		} while (n<0);
		
		
		int arrStart[] = new int[n];
		
		//input element in array
		for( i = 0; i < arrStart.length; i++ ) {
			System.out.println("Nhap phan tu thu " + (i + 1) +": ");
			arrStart[i] = sc.nextInt();
		}
		System.out.print("Mảng ban đầu: ");
		for (int item : arrStart) {
			System.out.print( item+" ");
		}
		System.out.println();
		System.out.println("Mảng sau khi sắp xếp :");
		System.out.println(Arrays.toString(s.sortArray(arrStart)));
	}
}
