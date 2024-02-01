package trail;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


//using for each iteration
public class RemoveCharAndSort {

	public static void main(String[] args) {
		String str ="fkadjhscbhdkoiieoowwmwpwmnbc";
		char ch[] =str.toCharArray();
		Arrays.sort(ch);
		String sortChar= new  String(ch);
		
		System.out.println("sorted character : "+sortChar);
		
		// duplicate element remove
		String dublicateChar=duplicateRemoveElement(str);
		System.out.println("unique characters : "+dublicateChar);
	}

	private static String duplicateRemoveElement(String str) {
		// TODO Auto-generated method stub
		Set<Character> uniqueChar= new HashSet<Character>();
		for (Character c : str.toCharArray()) {
			uniqueChar.add(c);
			
		}
		StringBuilder result = new StringBuilder();
		//merge all character
		for (Character c : uniqueChar) {
			result.append(c);
		}
		return result.toString();
	}

}
