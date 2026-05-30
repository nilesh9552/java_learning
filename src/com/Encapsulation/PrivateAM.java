package com.Encapsulation;



public class PrivateAM {
	private int a = 20;
	

	public void show() {
		System.out.println("Value of a is: "+ a);
		

	}
	public static void main(String[] args) {
		 PrivateAM a = new PrivateAM();
		 a.show();
		 System.out.println(a.a);
	}

}