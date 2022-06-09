package lec12;

public class ChildClass {
	
	public String name;
	public String gender;
	public int age;
	public ChildClass() {
		System.out.println("--child class constructor--");		
	}
	public void getInfo() {
		System.out.println("--getInfo() start--");
		System.out.println("name: "+name);
		System.out.println("gender: "+gender);
		System.out.println("age: "+age);
		mySecret();
	}
	private void mySecret() {
		System.out.println("--mySecret()--");
	}
	
}
