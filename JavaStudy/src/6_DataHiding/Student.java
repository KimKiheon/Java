package lec17_DataHiding;

public class Student {
	private String name;
	private int score;
	public Student(String name, int score) {
		this.name=name;
		this.score=score;
	}
	public void getInfo() {
		System.out.println("name:"+name);
		System.out.println("score:"+score);
		
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
