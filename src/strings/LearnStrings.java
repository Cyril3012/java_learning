package strings;

import java.io.IOException;

public class LearnStrings {

	public static void main(String[] args) throws IOException {
		String name = new String("Cyril");
		System.out.println(name);
		System.out.println(name.charAt(0));
		System.out.println(name.substring(2, 5));
		String s = "Cyril";
		String n = "Cyril";
		String m = "cyril";

		System.out.println(s.equals(name)); // true check val
		System.out.println(s == name);// false check obj ref
		System.out.println(s.equals(n)); // true
		System.out.println(s.equalsIgnoreCase(m));// true

		// concat using concat() + %s
		String con = String.format("%s %s", m, s);
		System.out.println(con);
		// Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");

	}

}
