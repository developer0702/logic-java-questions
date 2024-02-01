package trail2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOperation {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7);
		List<Integer> collect = list.stream().map(s -> s%2==0?s*s:s).collect(Collectors.toList());
		System.out.println(collect);

	}
}
