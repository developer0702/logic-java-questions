package NestedArray;

public class NestedArray2 {
	public static void main(String[] args) {
		// first array
		int[] a = { 10, 20, 30, 40 };

		// second array
		int[] b = { 50, 60, 70, 80 };

		// resultant array size
		int c = a.length + b.length;

		// create the resultant array
		int[] resultantArray = new int[c];

		// copy elements from the first array
		for (int i = 0; i < a.length; i++) {
			resultantArray[i] = a[i];
		}

//        for (int i : c) {
//			System.out.print(i+" ");
//		}

		// copy elements from the second array
		for (int i = 0; i < b.length; i++) {
			resultantArray[a.length + i] = b[i];
		}

		// prints the resultant array
		for (int value : resultantArray) {
			System.out.print(value + " ");
		}
	}
}
