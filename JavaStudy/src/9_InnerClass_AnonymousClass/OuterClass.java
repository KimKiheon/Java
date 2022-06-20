package lec20_InnerClass_AnonymousClass;

public class OuterClass {
	int num=10;
	String str1="java";
	static String str2="world";
	public OuterClass() {
		// TODO Auto-generated constructor stub
		System.out.println("outer constructor");
	}
	class InnerClass{
		int num=100;
		String str2=str1;
		public InnerClass() {
			// TODO Auto-generated constructor stub
			System.out.println("inner constructor");
		}
		
	}
	static class SInnerClass{
		int num=1000;
		String str3=str2;
		public SInnerClass() {
			// TODO Auto-generated constructor stub
			System.out.println("static inner constructor");
		}
	}

}
