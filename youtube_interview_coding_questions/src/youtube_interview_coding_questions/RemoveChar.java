package interview_project;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveChar {

//remove duplicate char from string
	public static void main(String[] args) {
		String str = "wpoxyaabbcdeefggrrskhlpoyes";
		char ch[] = str.toCharArray();
		Arrays.sort(ch);

		System.out.println("sorted characters : " + ch);
		String removeString = removeString(str);
		System.out.println("dubplicate char remove : " + removeString);
	}

	private static String removeString(String str) {

		Set<Character> uniqueChar = new HashSet<>();

		for (Character c : str.toCharArray()) {
			uniqueChar.add(c);
		}

		StringBuilder result = new StringBuilder();
		for (Character c : uniqueChar) {
			result.append(c);
		}
		return result.toString();

	}
}