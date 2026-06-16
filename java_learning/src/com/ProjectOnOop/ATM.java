package com.ProjectOnOop;
import java.util.Scanner;

 class BankAccount{
	private String AccountNumber;
	 private String AccountHolder;
	private double Balance;
	private  String Pin;
	
	
public BankAccount(String AccountNumber,String AccountHolder, double InitialBalance, String Pin) {
	this.AccountNumber = AccountNumber;
	this.AccountHolder = AccountHolder;
	this.Balance = InitialBalance;
	this.setPin(Pin);
	
}
void checkBalance() {
	System.out.println("current Balance is"+ Balance);
}
void Deposite(double amount) {
	if (Balance < 0) {
		
		System.out.println("Enter Currect Amount");
	}else {
		Balance = Balance + amount;
		System.out.println("Rs"+ amount +"Deposite successfull" );
	}
	
	
}

void withdraw(double amount) {
	
	if(amount > Balance ) {
		System.out.println("Insufficient Balance");
	}
	else {
		Balance = Balance - amount;
		System.out.println("Rs"+ amount + " withdraw successfully");
		
	}
	
}
void changePin(String newPin) {
	setPin(newPin);
	System.out.println("Pin Change successfully");
}
void ShowDetails() {
	System.out.println("Account Number" + AccountNumber );
	System.out.println("Account Holder" + AccountHolder);
	System.out.println("Balance" + Balance);
}
public String getPin() {
	return Pin;
}
public void setPin(String pin) {
	Pin = pin;
}


	
}

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount acc = new BankAccount("acc1234", "Nilesh Jagtap", 55000, "1234"); 
			System.out.println("This is ATM Machine");
			System.out.println("Enter The Pin");
			String enteredPin = sc.nextLine();
			if(! enteredPin.equals(acc.getPin())) {
				System.out.println("Wrong Pin");
				return;
			}System.out.println("Login Successfully");
			
			
			int choice;
			
			do {
				System.out.println("1.Check Balance");
				System.out.println("2.Deposite Money");
				System.out.println("3.withdraw Money");
				System.out.println("4.change Pin");
				System.out.println("5.Account details");
				System.out.println("0.Exit");
				System.out.println("Enter Choice");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					acc.checkBalance();
					break;
				case 2:
					System.out.println("Enter Amount ");
					double DepositeMoney = sc.nextDouble();
					acc.Deposite(DepositeMoney);
					break;
				case 3:
					System.out.println("Enter Amount");
					double withdrawAmount = sc.nextDouble();
					acc.withdraw(withdrawAmount);
					break;
				case 4:
					sc.nextLine();
					System.out.println("Enter New Pin");
					 	String newPin = sc.nextLine();
					 	acc.changePin(newPin);
					 	break;
				case 5:
					acc.ShowDetails();
					break;
				case 0: 
					System.out.println("Thank you🙏");
					break;
					default:
						System.out.println("Invalid Input");
					
				}
			}while (choice != 0);
			sc.close();
		
	}
	

}
