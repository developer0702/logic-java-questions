package interview_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PalindromeAll {
	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("madam","eye","john","sanjay","vikash");
		 List<String> collect = asList.stream().filter(s->s.equals(new StringBuilder(s).reverse().toString())).collect(Collectors.toList());
		 
		System.out.println(collect);
	}
}
