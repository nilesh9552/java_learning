package com.mulitithreding;
class p extends Thread {
	public void run() {
	for(int i = 1; i < 3; i++) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	
}
}

public class Priority {
	public static void main(String[] args) {

		p t1 = new p();
		p t2 = new p();
		p t3 = new p();
		
		t1.setName("Thread -1");
		t2.setName("Thread -2");
		t3.setName("Thread -3");
		t1.start();
		t2.start();
		t3.start();
		t1.setPriority(10);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
	}

}
