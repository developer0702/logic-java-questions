package regularEx;

import java.util.regex.Pattern;

public class SpecialChars {
	public static void main(String[] args) {
		String str = "asdf$%&@123sd45";
		StringBuilder builder = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (Pattern.matches("[^a-zA-Z0-9]", Character.toString(ch))) {
				builder.append(ch);
			}
		}

		System.out.println(builder.toString());
	}

}
