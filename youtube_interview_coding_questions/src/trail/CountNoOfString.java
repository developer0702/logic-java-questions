package trail;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountNoOfString {

	public static void main(String[] args) {
		String str = "aoeiufkak";
		Map<Character, Long> collect = str.chars().mapToObj(s -> (char) s)
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		System.out.println(collect);

		// duplicate element remove

		Set<Character> uniqueChar = str.chars().mapToObj(s->(char)s).collect(Collectors.toSet());
		System.out.println(uniqueChar);
		
	}
}
