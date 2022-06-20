package lec22_AbstractClass;

public class MainClass {
	public static void main(String[] args) {
		AbstractClassEx ex= new ClassEx(10,"Java");
		System.out.println();
		AbstractClassEx ex2= new ClassEx();
		System.out.println();
		
		
		ex.fun1();
		ex.fun2();
		System.out.println();
		ex2.fun1();
		ex2.fun2();
		
		System.out.println();
		Bank mybank = new MyBank("±Ë±‚«Â","12345",35789);
		mybank.deposit();
		mybank.withdraw();
		mybank.installmentSavings();
		mybank.cancellation();
		//Bank mybank2 = new MyBank();
		mybank.getInfo();
		//mybank2.getInfo();
	}
}
