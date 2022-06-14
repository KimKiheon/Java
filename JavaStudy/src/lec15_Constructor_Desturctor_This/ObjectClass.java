package lec15_Constructor_Desturctor_This;

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
		//this.x,y?? ????ï¿?????? x, yï¿?? ï¿??ë¦¬ï¿½?ï¿½ï¿½?? ï¿???ï¿½ï¿½??.
		//this = ï¿??ì²´ï¿½?ï¿½ï¿½? ??ï¿??
	}
	public void getInfo() {
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	

}
