package lec15_积己磊客_家戈磊_弊府绊_this;

public class MainClass {
	public static void main(String[] args) {
		int[] arr= {10,20,30};
		ObjectClass obj1= new ObjectClass("hi",arr);
		ObjectClass obj2= new ObjectClass(10,20);
		obj2.getInfo();
		
	}
}
