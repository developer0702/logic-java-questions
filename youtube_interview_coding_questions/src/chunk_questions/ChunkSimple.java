package chunk_questions;

import java.util.*;

public class ChunkSimple {

    public static void main(String[] args) {
        // Assuming the input array is from 1 to 50
    	
    	// Array Initialization:
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int chunk = 3; // chunk size to divide
        for (int i = 0; i < arr.length; i += chunk) {
        	// Arrays.copyOfRange to extract a chunk of elements from the original array.
            int[] chunkArray = Arrays.copyOfRange(arr, i, Math.min(arr.length, i + chunk));
            
            //after that converts array to string
            String result = Arrays.toString(chunkArray);
            System.out.println(result);
        }
    }
}
