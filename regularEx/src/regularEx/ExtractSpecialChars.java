package regularEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractSpecialChars {
	public static void main(String[] args) {
		String str = "asdf$%&@123sd45KJHG";

		// Use regular expression to match the desired pattern
		String pattern = "[^a-zA-Z0-9]";
		Pattern regex = Pattern.compile(pattern);
		Matcher matcher = regex.matcher(str);

		// Find and print the matched special characters
		StringBuilder result = new StringBuilder();
		while (matcher.find()) {
			result.append(matcher.group());
		}

		System.out.println(result.toString());
	}
}
