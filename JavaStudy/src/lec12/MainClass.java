package lec12;

public class MainClass {
	public static void main(String[] args) {
		ChildClass child1 = new ChildClass();
		child1.getInfo();
		
		child1.age=25;
		child1.name="Tech";
		child1.gender="M";
		child1.getInfo();
		
		//child1.mysecret(); 외부에서 실행 불가능
	}
}
