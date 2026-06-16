package com.polymorephism;

public class MethodOverLoding {
	public void show() {
		int a = 10; 
		int b = 5;
		System.out.println(a+b);
	}
	public void show(int a ) {
		int b = 5;
		System.out.println(a-b);
	}
	public void show(int a, int b ) {
		System.out.println(a*b);
	}
	public void show(String name, int age) {
		System.out.println("my name is "+ name);
		System.out.println("Iam "+ age + " years older ");
	}
	public void show(int a, int b , int c) {
		
	}
public static void main(String[] args) {
	MethodOverLoding  p1 = new MethodOverLoding();
	p1.show();
	p1.show(10);
	p1.show(5,4);
	p1.show("Nilesh", 20);
	
	
}
}
