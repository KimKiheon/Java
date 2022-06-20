package lec18_Inheritance;

public class MainClass {
	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		child.parentFunc();
		child.childFunc();
		//child.parentFunc2(); private 메서드는 이용 불가
	}

}
