package trail;

import java.util.Arrays;

public class A {
    public static void main(String[] args) {
		int [] arr= new int[50];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;
		}
		int chunk=3;
		for (int i = 0; i < arr.length; i+=chunk) {
			int[] chunkArray = Arrays.copyOfRange(arr, i,Math.min(arr.length, i+chunk));
			String result = Arrays.toString(chunkArray);
			System.out.println(result);
		}
    }
}