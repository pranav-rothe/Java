package javaRevision;

public class BankAccount {

	//global private variable
	private String bankName;
	private String accountHolderName;
	private double balance;
	
	//constructor
	public BankAccount(String bankName, String accountHolderName, double balance) {
		this.bankName=bankName;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
		System.out.println("BankName: "+bankName+" || Name: "+accountHolderName+" || Balance: "+balance+"/-");
		System.out.println();
	}
	
	//method amount deposit money
	public void deposit(double amount) {
		this.balance=balance+amount;
		System.out.println("Deposited Amount: "+amount+"/-");
		System.out.println("New Balanced: "+this.balance+"/-");
		System.out.println();
	}
	
	public void withDrawn(double amount) {
		this.balance=balance-amount;
		if(amount>this.balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			System.out.println("WithDrawn: "+amount+"/-"+" New Balance "+this.balance+"/-");
		}
	}
	
	public static void main(String[] args) {
		BankAccount accountOne=new BankAccount("SBI","Pranav Rothe", 5000);
		accountOne.deposit(1000);
		accountOne.withDrawn(2500);
		
	}

}
