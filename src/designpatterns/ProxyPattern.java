package designpatterns;

abstract class Account {

	protected long accountNo;
	protected String name;
	protected double balance;

	public abstract double getBalance();
	public abstract void deposit(double);
	public abstract Account create();
}

class cAccount extends Account { // real subject => full implementation
	public cAccount(long a, String s, double b){
		accountNo = a;
		name = s;
		balance = b;
	}

	public double getBalance(){
		return balance;
	}

	public void deposit(double amt){
		balance += amt;
	}

	public Account create(){
		// read parameters a,s and b
		return new cAccount(a, s, b);
	}
}

class Proxy extends Account {
	cAccount a = new cAccount();

	public double getBalance() {
		return a.getBalance();
	}

	public void deposit(double amt) {
		a.deposit(amt);
	}

	public Account create() {
		System.out.print("Error : Not Allowed")  ;
	}
}

class Client {
	public static void main(String [] args) {
		// press 1 to create account

		// press 2 to get balance

		// press 3 to create account

		// read user input into a variable called choice

		Proxy p = new Proxy();

		if(choice == 1) {
			p.create();
		}
		else if(choice == 2) {
			p.getBalance();
		}
		else if(choice == 3) {
			p.deposit();
		}
	}
}