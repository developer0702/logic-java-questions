package trail;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EvenFilter {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(13, 2, 3, 4, 5, 68, 10, 12);
		Collections.sort(list);
		System.out.println("sorting without filter");
		System.out.println(list);
		System.out.println("********************");
		List<Integer> collect = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
		System.out.println(collect);
	}
}
