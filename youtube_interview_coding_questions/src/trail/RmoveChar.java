package trail;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RmoveChar {

   //remove duplicate character using stream api
	public static void main(String[] args) {
		String str = "owosaknsabnhdgcmfasjhdgjdf";
		System.out.println(removeCharacter(str));
		char ch[] = str.toCharArray();
		Arrays.sort(ch);
		String result = new String(ch);
		System.out.println(result);

	}

	private static String removeCharacter(String str) {
		return str.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
	}
}
