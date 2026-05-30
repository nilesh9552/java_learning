package com.Arrays;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class CreateArrya {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[] = new int [5]; 
	int arr1[] = {10,20,30,40};
	arr[0] = 5;
	arr[1] = 8;
	arr[2] = 9;
	arr[3] = 2;
	arr[4] = 4;
	

Arrays.sort(arr);
for(int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}


System.out.println("-------------------");
for(int i = arr.length-1; i >= 0; i--) {
	System.out.println(arr[i]);
}

int arr2[] = new int[5];
System.out.println("Enter the arr2 elements");
for(int i = 0; i< arr2.length; i++) {
	
	arr2[i]= sc.nextInt();
}
System.out.println("======The sort array=======");
Arrays.sort(arr2);
for(int i = 0; i < arr2.length; i++) {
	System.out.println(arr[i]);
}
System.out.println("====Reverse sort arr2====");

for(int i =arr2.length-1; i >= 0; i--) {
	System.out.println(arr2[i]);
}


}

}

