package trail;

import java.util.Stack;

public class ValidateString1 {
	public static void main(String[] args) {

		String str = "(){}[";
		boolean validString = isValidString(str);
		if (validString) {
			System.out.println("valid String :" + str);
		} else {
			System.out.println("not valid string :" + str);
		}
	}

	private static boolean isValidString(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == ')') {
				if (stack.peek() == '(') {
					stack.pop();
				} else {
					return false;
				}
			} else if (ch == '}') {
				if (stack.peek() == '{') {
					stack.pop();
				} else {
					return false;
				}
			} else if (ch == ']') {
				if (stack.peek() == '[') {
					stack.pop();
				} else {
					return false;
				}
			} else {
				stack.push(ch);
			}
		}
		if (stack.size() == 0) {
			return true;
		}
		return false;
	}
}
