package logic;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FIndCharUsingStream {

	public static void main(String[] args) {
		String input = "aabbccdeeff";
		findFirstRepeatedAndNonRepeated(input);
	}

	public static void findFirstRepeatedAndNonRepeated(String s) {
		// Collect the character frequencies using a LinkedHashMap to maintain the order
		Map<Character, Long> charFrequencies = s.chars().mapToObj(c -> (char) c).collect(LinkedHashMap::new,
				(map, c) -> map.merge(c, 1L, Long::sum), LinkedHashMap::putAll);

		// Find the first non-repeated character
		Optional<Character> firstNonRepeated = charFrequencies.entrySet().stream()
				.filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst();

		// Find the first repeated character
		Optional<Character> firstRepeated = charFrequencies.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.map(Map.Entry::getKey).findFirst();

		// Print the results
		firstNonRepeated.ifPresent(nonRepeated -> System.out.println("First Non-Repeated Character: " + nonRepeated));
		firstRepeated.ifPresent(repeated -> System.out.println("First Repeated Character: " + repeated));
	}

}
