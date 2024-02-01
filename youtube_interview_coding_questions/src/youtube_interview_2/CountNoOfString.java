package youtube_interview_2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountNoOfString {
	public static void main(String[] args) {

		String str = "aslkjajd";

	 Map<String, Long> collect = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(s -> s,Collectors.counting()));
		System.out.println(collect);

	}
}
