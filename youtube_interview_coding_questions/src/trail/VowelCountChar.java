package trail;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VowelCountChar {

	public static void main(String[] args) {
		String str ="ajdhahdaoeioaukscakjd";
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
		Map<Character, Long> countCh = str.chars().mapToObj(s->(char)s).filter(vowels::contains).collect(Collectors.groupingBy(s->s,Collectors.counting()));
		countCh.forEach((vowel,ch)-> System.out.println(vowel+" = "+ch));
		
	}
}
