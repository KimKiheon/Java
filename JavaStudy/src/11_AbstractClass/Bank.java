package lec22_AbstractClass;

public abstract class Bank {
	String name;
	String account;
	int totalAmount;

	public Bank() {
		System.out.println("Bank const no param");
	}

	public Bank(String name, String account, int totalAmount) {
		System.out.println("Bank const with param");
		this.name = name;
		this.account = account;
		this.totalAmount = totalAmount;
	}
	
	public void deposit() {
		System.out.println("deposit(예금) start");
	}
	public void withdraw() {
		System.out.println("withdraw(출금) start");
	}
	public abstract void installmentSavings();
	public abstract void cancellation();
	
	public void getInfo() {
		System.out.println("name: "+name);
		System.out.println("account: "+account);
		System.out.println("totalAmount: "+totalAmount);
	}
	
}
