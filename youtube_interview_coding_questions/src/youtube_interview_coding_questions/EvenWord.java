package youtube_interview_coding_questions;

// print even length of word of string element
public class EvenWord {

	public static void main(String[] args) {

		String str = "hell world prog javac";
		for (String even : str.split(" ")) {
			if (even.length() % 2 == 0) {
				System.out.println(even);
			}
		}

	}

}
