package trail;

public class Palindrome {
	public static void main(String[] args) {

	
		boolean b= isPalindrome("madam");
		if (b) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	
	}
	private static boolean isPalindrome(String s) {
		
		return s.equals(new StringBuilder(s).reverse().toString());
	}
}
