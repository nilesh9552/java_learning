package com.Exception;
import java.util.Scanner;

public class AgeVote {
public static void main(String[] args) throws NotValidAge {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Age");
	int  age = sc.nextInt();

	if(age >= 18) {
		System.out.println("You Are eligiable for Voit");
	}else {
		throw new NotValidAge("You are Not allowed to vote"); 
	}
	
}
}
