package practical_session2;

public class A {
	public static void main(String[] args) {

		int arr1[] = { 2, 3, 4, 5, 6, 7, 8 };
		int arr2[] = { 11, 23, 45, 22, 16, 65 };
		
		int totalLength = arr1.length + arr2.length;
		
		int mergeArray[] = new int[totalLength];
		for (int i = 0; i < arr2.length; i++) {
			mergeArray[i]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			mergeArray[arr1.length+i]=arr2[i];
			
		}
		for (int i : mergeArray) {
			System.out.print(i+" ");
		}
	}
}
