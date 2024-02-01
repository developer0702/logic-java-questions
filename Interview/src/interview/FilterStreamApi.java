package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// filter elements divisible by 2
public class FilterStreamApi {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(99,87,65,22,33,44,56,32,24,56,45,67,35,76);
	List<Integer> collect = list.stream().filter(s->s%2==0).collect(Collectors.toList());
	System.out.println(collect);
	
}
}
