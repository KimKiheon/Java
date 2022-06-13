package lec21_Interface;

public class ToyRobot implements Toy{
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Robot can walk");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Robot can run");
	}
	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("Robot can`t alarm");
	}
	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("Robot can light");
	}

}
