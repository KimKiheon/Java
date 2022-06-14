package lec19.Features_of_Inheritance;

public class ChildClass extends ParentClass{
	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("child constructor");
	}
	public void computer() {
		System.out.println("very good computer");
	}
	int x=50;
	public void printX() {
		System.out.println("ChildClass X:"+this.x);
		System.out.println("ParentClass X:"+super.x);
	}
}
