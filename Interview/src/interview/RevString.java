package interview;

public class RevString {
	public static void main(String[] args) {

		System.out.println("Reverse string print");
		String str = "mike is best things";
		for (int i = str.length()-1; i>0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
