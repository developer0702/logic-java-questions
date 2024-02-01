package logic;

import java.util.HashMap;

//find character and no of character
public class Countcharac {

	public static void main(String[] args) {
		String str ="google";
		HashMap<Character, Integer> countChar= new HashMap<>();
		for (int i = str.length()-1; i >=0; i--) {
			if (countChar.containsKey(str.charAt(i))) {
				int count =countChar.get(str.charAt(i));
				countChar.put(str.charAt(i), ++count);
			}else {
				countChar.put(str.charAt(i), 1);
			}
		}
		System.out.println(countChar);
	}
}
