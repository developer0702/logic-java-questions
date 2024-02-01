package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//map operation by stream api
public class MapOperation {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(98, 78, 23, 22, 13, 43, 45, 25, 76, 43, 66);
		Collections.sort(list);
		List<Integer> collect = list.stream().map(s -> s * 2).collect(Collectors.toList());
		System.out.println(collect);
	}
}
