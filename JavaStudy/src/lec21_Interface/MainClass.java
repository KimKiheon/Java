package lec21_Interface;

public class MainClass {
	public static void main(String[] args) {
		InterfaceA ia = new InterfaceClass();
		InterfaceB ib = new InterfaceClass();
		
		ia.funA();
		ib.funB();
		
		System.out.println("\n\n");
		
		Toy robot = new ToyRobot();
		Toy airplane = new ToyAirplane();
		
		Toy toys[] = {robot, airplane};
		for(int i = 0; i < toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
		}
	}

}
