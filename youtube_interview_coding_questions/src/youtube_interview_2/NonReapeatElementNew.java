package youtube_interview_2;

import java.util.HashMap;
import java.util.Map;

public class NonReapeatElementNew {
	public static void main(String[] args) {
		// First non-repeating character
		String str = "xoatjslkjayjd";

		// HashMap to store character counts
		Map<Character, Long> charCountMap = new HashMap<>();

		// Count occurrences of each character
		for (char c : str.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0L) + 1);
		}

		// Find the first non-repeating character
		char result = str.chars().mapToObj(ch -> (char) ch).filter(ch -> charCountMap.get(ch) == 1).findFirst()
				.orElseThrow(() -> new RuntimeException("No non-repeating characte3r found."));

		System.out.println("Non-repeating element of the string: " + result);
	}
}
