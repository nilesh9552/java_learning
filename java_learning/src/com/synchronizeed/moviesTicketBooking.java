package com.synchronizeed;



class ticket implements Runnable{
	int avaliable = 3;
	int customer ;
	ticket(int customer){
		this.customer = customer;
		
	}
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (this) {
			if(avaliable >= customer) {
				System.out.println(name+ " Ticket is avaliable");
				avaliable = avaliable - customer;
			}
			else {
				System.out.println(name + " Ticket is not avaliable");
			}
		}
		
	}
}
public class moviesTicketBooking {
	public static void main(String[] args) {
		ticket t = new ticket(1);
		Thread t1 =new  Thread(t);
		Thread t2 =new  Thread(t);
		Thread t3 =new  Thread(t);
		Thread t4 =new  Thread(t);
		Thread t5 =new  Thread(t);
		
		
		t1.setName("Nilesh");
		t2.setName("Mahesh");
		t3.setName("Sachin");
		t4.setName("Raju");
		t5.setName("Omkar");
		
		t1.start();t2.start();t3.start();t4.start();t5.start();	
	for(int i = 0; i<=6; i++) {
		for(int j = 0; j <= 6; j++) {
			if(i == 0||i==6 || j==6/2) {
			System.out.print("*");
		}
			else{
				System.out.print(" ");
			}}
		System.out.println();
		
	}
	
	}

}
