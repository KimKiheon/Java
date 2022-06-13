package lec21_Interface;

public class ToyAirplane implements Toy{
	public void walk() {
		System.out.println("airplane can`t walk");
	}
	public void run() {
		System.out.println("ariplane can`t run");
	}
	public void alarm() {
		System.out.println("ariplane can alarm");
	}
	public void light() {
		System.out.println("ariplane can`t light");
	}

}
