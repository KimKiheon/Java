package lec22_AbstractClass;

public class ClassEx extends AbstractClassEx{
	public ClassEx() {
		// TODO Auto-generated constructor stub
		System.out.println("ClassEx Constructor");
	}
	public ClassEx(int i,String s) {
		super(i,s);
		System.out.println("ClassEx constructor override");
		//System.out.println("i:"+i);
		//System.out.println("s:"+s);
	}
	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("fun2() start:");
	}
	

}
