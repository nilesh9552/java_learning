package com.polymorephism;

public class constOverLoding {
	constOverLoding (){
		System.out.println("this is default constractor");
	}
	public void  msg() {
		System.out.println("Hello Java Developer");
	}
public static void main(String[] args) {
	constOverLoding  c = new constOverLoding ();
	c.msg();
	constOverLoding c1 = new constOverLoding ();
	c1.msg();
	
}
}
