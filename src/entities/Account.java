package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	//Construtores e Sobrecarga
	public Account(int number, String holder, double iniDep) {
		this.number = number;
		this.holder = holder;
		deposit(iniDep);
	}
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	//Getters and Setters
	public int getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	
	//Depósito e Saque
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
	}
	
	
	
	
	
}
