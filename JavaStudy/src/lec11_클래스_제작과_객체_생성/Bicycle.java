package lec11_클래스_제작과_객체_생성;

public class Bicycle {
	
	public String color;
	public int price;
	
	public Bicycle() {
		System.out.println("Bicycle constructor");
	}
	public Bicycle(String c,int p) {
		System.out.println("Bicycle constructor");
		this.color = c;
		this.price = p;
	}
	
	public void info() {
		System.out.println(" -- info() --");
		System.out.println("color :" +color);
		System.out.println("price :" +price);
	}
}
