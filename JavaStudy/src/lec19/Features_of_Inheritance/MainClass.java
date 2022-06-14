package lec19.Features_of_Inheritance;

public class MainClass {
	public static void main(String[] args) {
		
	ChildClass child = new ChildClass();
	child.computer();
	ParentClass child2 = new ChildClass();
	child2.computer();
	System.out.println("\n\n");
	ParentClass[] pArr = new ParentClass[2];
	ParentClass fch = new FirstChildClass();
	ParentClass sch = new SecondChildClass();
	pArr[0]=fch;
	pArr[1]=sch;
	pArr[0].computer();
	pArr[1].computer();
	
	child.printX();//super
	}
}
