package application;

import java.util.Scanner;

import entities.Account;

public class Program {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Account acco;
		
		System.out.println("Enter account number:");
		int number = in.nextInt();
		System.out.println("Enter account holder");
		String holder = in.next();
		System.out.println("Is there an initial deposit (y/n)? ");
		String response = in.next();
		
		if(response.equalsIgnoreCase("Y")) {
			System.out.println("Enter initial deposit value: ");
			double iniDep = in.nextDouble();
			acco = new Account(number, holder, iniDep);
		}else {
			acco = new Account(number, holder);
		}
		System.out.println("Account data: ");
		System.out.println(acco);
		System.out.println("Enter deposit value: ");
		double depVal = in.nextDouble();
		acco.deposit(depVal);
		System.out.println(acco);
		
		System.out.println("Account data: ");
		System.out.println("Enter withdraw value: ");
		double witVal = in.nextDouble();
		acco.withdraw(witVal);
		System.out.println(acco);
		
	}
	
	
}
