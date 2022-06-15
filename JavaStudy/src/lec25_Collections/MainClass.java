package lec25_Collections;

import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("Java");
		list.add("world!");
		list.add(2, "Programming");
		System.out.println(list);
		System.out.println(list.size());

		// list.removeAll(list);
		// System.out.println(list);

		list.set(1, "C");
		System.out.println(list);
		String str = list.get(2);
		System.out.println(str);
		list.remove(2);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		

	}

}
