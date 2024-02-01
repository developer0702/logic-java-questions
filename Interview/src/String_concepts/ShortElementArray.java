package String_concepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//integer type find element by array

public class ShortElementArray {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,4,5,6,7,78,99,53,2);
		
		Collections.sort(list);
		System.out.println(list);
	}
}
