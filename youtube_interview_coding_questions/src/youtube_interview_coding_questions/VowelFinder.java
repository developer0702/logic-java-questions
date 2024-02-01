package youtube_interview_coding_questions;

import java.util.Arrays;
import java.util.List;


//find vowels from String element
public class VowelFinder {

	public static void main(String[] args) {
		  String str= "Hello java 8 vowel examples";
		  
		  String lowerCase = str.toLowerCase();
		  
		  List<Character> vowels = Arrays.asList('a','e','i','o','u');
		  long vowelCount= lowerCase.chars().mapToObj(c->(char)c).filter(vowels::contains).count();
		  
		  
		  System.out.println(vowelCount);
		  
	}
}
