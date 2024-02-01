package demo;

import java.util.HashMap;

public class Student {

	public static void main(String[] args) {
		String str = "MINIMUM";

		HashMap<Character, Integer> CountChar = new HashMap<>();
		for (int i = str.length() - 1; i > 0; i--) {
			if (CountChar.containsKey(str.charAt(i))) {
				int count = CountChar.get(str.charAt(i));
				CountChar.put(str.charAt(i), ++count);
			} else {
				CountChar.put(str.charAt(i), 1);
			}
		}
		System.out.println(CountChar);
	}
}
