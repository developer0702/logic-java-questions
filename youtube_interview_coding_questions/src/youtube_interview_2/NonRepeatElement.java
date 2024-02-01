package youtube_interview_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class NonRepeatElement {

	public static void main(String[] args) {
		
		//first non repeating character
		String str = "oatjslkjayjd";

		String result = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s,LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(s -> s.getValue() == 1).findFirst().get().getKey();

		System.out.println("non repeating element of string : "+result);

		System.out.println("================================");
		
		int [] n= {9,8,65,2,3,4,5,6,7,8};
		 Integer integer = Arrays.stream(n).boxed().sorted(Comparator.reverseOrder())
				.findFirst().get();
				
		System.out.println("non repeating element of integer : "+integer);	
		
	}
}
