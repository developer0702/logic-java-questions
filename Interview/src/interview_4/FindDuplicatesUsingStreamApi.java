package interview_4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// find duplicate values using stream api
public class FindDuplicatesUsingStreamApi {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(2, 4, 2, 5, 1, 2, 4, 5, 4, 4, 4, 6,1);

		Map<Integer, Long> collect = asList.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		Set<Integer> collect2 = collect.entrySet().stream().filter(e -> e.getValue() >1).map(Map.Entry::getKey)
				.collect(Collectors.toSet());

		System.out.println(collect2);
	}
}
