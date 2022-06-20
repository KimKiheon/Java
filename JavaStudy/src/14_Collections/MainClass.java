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
		//isEmpty()의 반환형은 Boolean
		System.out.println("--------------------");
		
		HashMap<Integer, String>map = new HashMap<Integer, String>();
		//앞에가 Key값, 뒤가 Value값
		map.put(5, "Hello");
		map.put(6, "Java");
		map.put(7, "World!");
		System.out.println("map:" +map);
		System.out.println("map.size():"+map.size());
		map.put(8, "good");
		System.out.println("map: "+map);
		map.put(6, "()");
		System.out.println("6번 밸류값 교체 후:"+map);
		System.out.println("5번값 : "+map.get(5));
		map.remove(8);
		System.out.println("8번값 제거 : "+map);
		
		boolean chk;
		chk = map.containsKey(7);
		System.out.println("map.containKey(7): "+chk);
		
		chk=map.containsValue("World!");
		System.out.println("containsValue(world!)"+chk);
		

	}

}
