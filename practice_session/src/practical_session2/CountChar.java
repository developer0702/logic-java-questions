package practical_session2;

import java.util.Map;
import java.util.stream.Collectors;

public class CountChar {

	public static void main(String[] args) {

		String str = "euajidoijio";
		Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(collect);
	}
}
