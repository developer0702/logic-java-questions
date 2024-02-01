package global;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] arr1 = { 4, 5, 2, 25 };
		int[] arr2 = { 13, 7, 6, 12 };

		System.out.println("Output for arr1:");
		printNextGreaterElement(arr1);

		System.out.println("\nOutput for arr2:");
		printNextGreaterElement(arr2);
	}

	public static void printNextGreaterElement(int[] arr) {
		int n = arr.length;
		Stack<Integer> stack = new Stack<>();
		Map<Integer, Integer> nextGreater = new HashMap<>();

		// Traverse the array from right to left
		for (int i = n - 1; i >= 0; i--) {
			// Pop elements from the stack while they are smaller than or equal to the
			// current element

			while (!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}

			// If stack is not empty, the next greater element is on top of the stack
			if (!stack.isEmpty()) {
				nextGreater.put(arr[i], stack.peek());
			} else {
				// If stack is empty, no greater element exists on the right
				nextGreater.put(arr[i], -1);
			}

			// Push the current element into the stack
			stack.push(arr[i]);
		}

		// Print the result
		for (int num : arr) {
			System.out.println(num + " --> " + nextGreater.get(num));
		}
	}
}
