package com.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Try_Catch_Finally {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		
		try {
			
			System.out.println("Enter Num1");
			int a = sc.nextInt();
			System.out.println("Enter Num2");
			int b = sc.nextInt();
			System.out.println(a/b);
			int arr[]= new int[5];
			System.out.println(arr[5]);
		}catch(ArithmeticException | InputMismatchException | ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("Enter valid Number");
		}
		
		
		}
		
	
}

