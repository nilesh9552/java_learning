package com.mulitithreding;
class s extends Thread{
	public void run() {
		for(int i = 1; i <= 3; i ++) {
			String name = Thread.currentThread().getName();
			System.out.println(name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class SleepMethod {
public static void main(String[] args) throws InterruptedException {
	for(int i = 0; i < 3; i ++) {
		System.out.println("This is main method");
		Thread.sleep(2000);
	}
	s t1 = new s();
	s t2 = new s();
	s t3 = new s();
	
	
	t1.setName("This is  t1");
	t2.setName("This is  t2");
	t3.setName("This is  t3");
	t1.start();
	t2.start();
	t3.start();
	
	
	
}
}
