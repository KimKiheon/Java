package lec15_생성자와_소멸자_그리고_this;

public class ObjectClass {
	
	public int x;
	public int y;
	
	
	public ObjectClass(String n,int[] arr) {
		System.out.println("--objectClass");
		System.out.println("s:"+n);
		System.out.println("arr:"+arr);
	}
	public ObjectClass(int x, int y) {
		this.x=x+10;
		this.y=y+10;
		//this.x,y는 전역변수인 x, y를 가리키는 것이다.
		//this = 객체라고 생각
	}
	public void getInfo() {
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	

}
