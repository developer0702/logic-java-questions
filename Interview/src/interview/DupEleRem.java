package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// sorting and duplicate element remove from list

public class DupEleRem {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(25,9,11,10,10,18,18,17,16,14,9);

		Collections.sort(list);
		System.out.println(list);
		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		 List<Integer> collect2 = list.stream().filter(s->s%2==0).collect(Collectors.toList());
		System.out.println(collect2);
		
	}
}
