package lec12.Class.and.Object;

public class MainClass {
	public static void main(String[] args) {
		
		Grandeur myCar1 = new Grandeur();
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 100;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		Bicycle myBicycle = new Bicycle();
		myBicycle.color = "red";
		myBicycle.price = 100;
		myBicycle.info();
		
		Bicycle myBicycle2 = new Bicycle("blue",100);
		myBicycle2.info();
		myBicycle2.color = "yellow";
		myBicycle2.info();
	}
}
