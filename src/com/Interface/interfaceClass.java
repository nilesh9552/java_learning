package com.Interface;

import java.util.Scanner;

interface Client{
	public void input();
	public void output();
	default void show() {
		System.out.println("this is defualt method");
	}
	static void msg() {
		System.out.println("this is static method");
	}
}
public class interfaceClass implements Client
{
	String name;
	double salary;
	Scanner sc = new Scanner(System.in);
	@Override
	public void input() {
		
		System.out.println("Enter Emp Name");
		 name = sc.nextLine();
		System.out.println("Enter Emp Salary");
		salary = sc.nextInt();
		
	}
	@Override
	public void output() {
		System.out.println("Emp Name is "+ name);
		System.out.println("Emp Syalary is :"+ salary);
		
		
	}
	public static void main(String[] args) {
		interfaceClass i = new interfaceClass();
		i.input();
		i.output();
		i.show();
		Client.msg();
		
		
		
	}

}
