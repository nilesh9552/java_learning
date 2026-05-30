package com.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class arrSorting {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the elements of arr");
	int arr[] = new int [5];
	for(int i = 0 ; i<arr.length; i++ ) {
		arr[i] = sc.nextInt();	
		}
	System.out.println("=========================+++");
	System.out.println("=========================+++");
	System.out.println("=========================+++");
	
	
	Arrays.sort(arr);
			
	for(int i = arr.length-1 ; i >= 0; i--) {
		System.out.println(arr[i]);
	}
	sc.close();
}



}
