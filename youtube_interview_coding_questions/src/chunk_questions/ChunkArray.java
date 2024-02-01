package chunk_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChunkArray {
	public static void main(String[] args) {
		// Assuming the input array is from 2 to 50
		int[] inputArray = new int[49];
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = i + 2;
		}

		// Specify the chunk size
		int chunkSize = 3;

		// Create chunks
		List<int[]> chunks = chunkArray(inputArray, chunkSize);

		// Display the chunks
		for (int i = 0; i < chunks.size(); i++) {
			System.out.println("Chunk " + (i + 1) + ": " + Arrays.toString(chunks.get(i)));
		}
	}

	private static List<int[]> chunkArray(int[] array, int chunkSize) {
		List<int[]> chunks = new ArrayList<>();

		for (int i = 0; i < array.length; i += chunkSize) {
			int end = Math.min(array.length, i + chunkSize);
			int[] chunk = Arrays.copyOfRange(array, i, end);
			chunks.add(chunk);
		}

		return chunks;
	}
}