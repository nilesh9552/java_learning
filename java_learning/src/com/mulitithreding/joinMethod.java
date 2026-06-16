package com.mulitithreding;
class s extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class joinMethod {
public static void main(String[] args) {
	s t1 = new s();
	s t2 = new s();
	s t3 = new s();
	Thread.join	
	t1.start();t2.start();t3.start();
	
}
}
