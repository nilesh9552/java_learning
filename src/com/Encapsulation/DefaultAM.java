package com.Encapsulation;

public class DefaultAM {
	int a = 10;
	public void show() {
		System.out.println("Value of a is :"+ a);
	}
public static void main(String[] args) {
	DefaultAM d = new DefaultAM();
	System.out.println(d.a);
	d.show();
}
}
