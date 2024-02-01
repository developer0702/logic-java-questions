package trail;

import java.util.HashMap;

//find the char and no of char
public class FindChar {

	public static void main(String[] args) {
		String str= "MINIMUM";
		HashMap<Character, Integer> countChar= new HashMap<>();
		for (int i = str.length()-1; i>0; i--) {
			if (countChar.containsKey(str.charAt(i))) {
				int count = countChar.get(str.charAt(i));
				countChar.put(str.charAt(i), ++count);
			}else {
				countChar.put(str.charAt(i), 1);
			}
		}
		System.out.println(countChar);
	}
}
