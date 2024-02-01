package youtube_interview_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {

		List<String> list2 = Arrays.asList("xajay", "eyes", "vijay", "ranjit", "aakash", "priyam");
//		list.add("vijay");
//		list.add("pankaj");
//		list.add("sanjay");

		Collections.sort(list2);
		System.out.println(list2);

		List<String> collect = list2.stream().map(s -> new StringBuilder(s).reverse().toString())
				.collect(Collectors.toList());
		System.out.println(collect);

	}

}
