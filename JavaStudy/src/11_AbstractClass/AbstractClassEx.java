package lec22_AbstractClass;

public abstract class AbstractClassEx {
	int num;
	String str;
	public AbstractClassEx() {
		System.out.println("AbstractClass constructor");
	}
	
	public AbstractClassEx(int i, String s) {
		System.out.println("AbstractClass constructor override");
		this.num=i;
		this.str=s;
		System.out.println("i,num:"+i+" "+this.num);
		System.out.println("str:"+this.str);
	}
	public void fun1() {
		System.out.println("fun1() start:"+num+" "+str);
	}
	public abstract void fun2();

}
