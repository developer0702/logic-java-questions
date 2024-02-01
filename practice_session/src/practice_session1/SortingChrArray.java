package practice_session1;

import java.util.Arrays;

public class SortingChrArray {

	public static void main(String[] args) {
		String str = "gjalkdkkkoemieosa";
		char ch[] = str.toCharArray();
		Arrays.sort(ch);
		String string = new String(ch);
		System.out.println(string);

	}
}
