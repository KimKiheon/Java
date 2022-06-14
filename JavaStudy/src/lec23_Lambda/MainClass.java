package lec23_Lambda;

public class MainClass {
	public static void main(String[] args) {
		// 매개변수와 실행문만으로 작성한다 (접근자, 반환형, return 생략)
		LambdaInterface1 li1 = (String s1, String s2, String s3) -> {
			System.out.println(s1 + " " + s2 + " " + s3);
		};
		li1.method("Hello", "java", "world");

		// 매개변수가 1개이거나 타입이 같을 때, 타입 생략 가능
		LambdaInterface2 li2 = (s1) -> {
			System.out.println(s1);
		};
		li2.method("Hello");

		// 실행문이 1개일 때, 중괄호 생략 가능
		LambdaInterface2 li3 = (s1) -> System.out.println(s1);
		li3.method("Hello");

		// 매개변수와 실행문이 1개일 때, 소괄호와 중괄호 생략 가능
		LambdaInterface2 li4 = s1 -> System.out.println(s1);
		li4.method("Hello");

		// 매개변수가 없을 때, ()만 작성
		LambdaInterface3 li5 = () -> System.out.println("no parameter");
		li5.method();

		// 반환값이 있는 경우
		LambdaInterface4 li6 = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.printf("li6.method(19, 20) : %d\n", li6.method(19, 20));
		li6 = (x, y) -> {
			int result = x * y;
			return result;
		};
		System.out.printf("li6.method(19, 20) : %d\n",li6.method(19,20));

	}

}
