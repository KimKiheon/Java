package lec17.DataHiding;

public class MainClass {
	public static void main(String[] args) {
		Student stu1=new Student("±Ë±‚«Â",100);
		stu1.getInfo();
		
		stu1.setScore(70);
		stu1.getInfo();
	}
}
