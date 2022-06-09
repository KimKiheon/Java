package lec13_객체와_메모리;

public class MainClass {
	public static void main(String[] args) {
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
		ObjectClass obj3 = new ObjectClass();
		
		System.out.println("obj1:" +obj1);
		System.out.println("obj2:" +obj2);
		System.out.println("obj3:" +obj3);
		
		//각 객체의 주소가 다르다
		
		obj1.getInfo();
		//obj1 = null;
		//obj1.getInfo(); NULLPointException이 발생한다.
		obj2.getInfo();
	}

}
