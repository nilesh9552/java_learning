package com.Inheritance;

class Perent {
	public void msg() {
		System.out.println("this is Perent class");
	}

	public void sum(int a, int b) {
		System.out.println("addation of a and b is :" + (a + b));
	}
}
public class SingleIn extends Perent {
	public void sub (int a, int b) {
		System.out.println("substration of a and b is: "+ (a - b));
	}


	

		public static void main(String[] args) {
			SingleIn s = new SingleIn();
			s.sum(5,5);
			s.sub(10,5);
			s.msg();
			

		}
	}


