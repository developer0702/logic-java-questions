package traverse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
	public static void main(String[] args) {
		ArrayList<String> listStr = new ArrayList<>();
		listStr.add("ram");
		listStr.add("shyam");
		listStr.add("vikash");
		listStr.add("amit");
		List<String> collStream=listStr.stream().map(s-> new StringBuilder(s).reverse().toString()).collect(Collectors.toList());
		System.out.println(collStream);
	}

}
