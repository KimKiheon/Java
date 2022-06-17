package lec26_ExceptionHandling;

import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		int i = 10, j = 0, r = 0;

		System.out.println("Exception Before");
		try {
			r = i / j;
		} catch (Exception e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println("msg: " + msg);
		} finally {
			System.out.println("finally");
		}
		System.out.println("Exception After");
		System.out.println("-------------");

		MainClass ma = new MainClass();
		try {
			ma.firstMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void firstMethod() throws Exception {
		secondMethod();
	}

	public void secondMethod() throws Exception {
		thirdMethod();
	}

	public void thirdMethod() throws Exception {
		System.out.println(10 / 0);
	}
	//third���� ���� �߻��� throws �������� second�� �ѱ�� �ٽ� first�� �ѱ��
	//try���� ������ catch������ ���ܸ� ��´�

}
