package trail;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeAll {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("madam","eye","stallin","vikash");
	 List<String> collect = asList.stream().filter(s->s.equals(new StringBuffer(s).reverse().toString())).collect(Collectors.toList());
	 System.out.println(collect);
		
	}
}
