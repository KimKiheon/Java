package lec22_AbstractClass;

public class MyBank extends Bank {
	public MyBank(String name, String account, int totalAmount) {
		super(name, account, totalAmount);
	}
	public MyBank() {
		System.out.println("mybank const no param");
	}
	public void installmentSavings() {
		System.out.println("Installmentsaving start");
	}
	public void cancellation() {
		System.out.println("cancellation start");
	}
}
