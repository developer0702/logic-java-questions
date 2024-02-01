package practical_session2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("sanjay","pankaj","aditya","soni","rakesh");
	
		List<String> rev = list.stream().map(s-> new StringBuilder(s).reverse().toString()).collect(Collectors.toList());
		System.out.println(rev);
	}
}
