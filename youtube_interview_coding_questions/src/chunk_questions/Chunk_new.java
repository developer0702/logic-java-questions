package chunk_questions;

import java.util.Arrays;

public class Chunk_new {

	public static void main(String[] args) {
		// Assuming the input array is from 2 to 50
		int[] arr = new int[50];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		int chunk = 3; // chunk size to divide
		for (int i = 0; i < arr.length; i += chunk) {
			String result = Arrays.toString(Arrays.copyOfRange(
					arr, i, Math.min(arr.length, i + chunk)));
			System.out.println(result);
		}
	}
}
