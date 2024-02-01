package youtube_interview_coding_questions;

import java.util.Arrays;

public class SortCharArray {

	public static void main(String[] args) {
		String str = "javaefpuosmsbf";
		char[] ch = str.toCharArray();

		Arrays.sort(ch);
		String sortedStr = new  String(ch);
		System.out.println(sortedStr);
	}
}
