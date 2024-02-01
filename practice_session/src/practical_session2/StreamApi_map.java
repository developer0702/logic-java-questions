package practical_session2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi_map {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(8, 2, 3, 4, 5, 6, 7);
		Collections.sort(asList);
		List<Integer> collect = asList.stream().map(s -> s % 2 == 0 ? s * s : s).collect(Collectors.toList());
		System.out.println(collect);
	}
}
