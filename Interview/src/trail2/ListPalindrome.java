package trail2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListPalindrome {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("sanjay", "eye", "vikash", "ranjeet");
		 List<String> collect = list.stream().filter(s->s.equals(new StringBuffer(s).reverse()
				.toString())).collect(Collectors.toList());
		System.out.println(collect);
	}
}

