package lec24_String;

public class MainClass {
	public static void main(String[] args) {
		String str = "JAVA";
		System.out.println(str);
		str = str + "_8";
		System.out.println(str);

		StringBuffer sf = new StringBuffer("JAVA");
		System.out.println(sf);
		sf.append(" WORLD");
		System.out.println(sf);
		System.out.println(sf.length());
		sf.insert(sf.length(), "abc");
		System.out.println(sf);
		System.out.println(sf+"333");
		sf.delete(sf.length()-3, sf.length());
		System.out.println(sf);
		
		StringBuilder sb = new StringBuilder();
		sb.insert(0, "Hi");
		System.out.println(sb);
	}

}
