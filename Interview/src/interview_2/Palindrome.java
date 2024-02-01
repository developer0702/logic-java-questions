package interview_2;

public class Palindrome {
	public static void main(String[] args) {
	
		boolean b=isPalindorme("eye");
		if (b) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
	
	private static boolean isPalindorme(String str) {
		return str.equals(new StringBuffer(str).reverse().toString());
	}
}
