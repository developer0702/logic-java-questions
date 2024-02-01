package practice_session1;

import java.util.Stack;

public class ValidString {
	public static void main(String[] args) {

		String str = "(){}[]";
		boolean status = validString(str);
		if (status) {
			System.out.println("validString :" + str);
		} else {
			System.out.println("not validString : " + str);
		}
	}

	private static boolean validString(String str) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == ')') {
				if (stack.peek() == '(') {

					stack.pop();
				} else {
					return false;
				}
			}

			else if (ch == '}') {
				if (stack.peek() == '{') {

					stack.pop();
				} else {
					return false;
				}
			}

			else if (ch == ']') {
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
