package trail2;

public class SinglePalindrome {
	public static void main(String[] args) {

		boolean b = isPalindrome("madam");
		if (b) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}

	private static boolean isPalindrome(String str) {
		return str.equals(new StringBuffer(str).reverse().toString());
	}
}
