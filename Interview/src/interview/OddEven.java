package interview;

public class OddEven {

	public static void main(String[] args) {
		
		System.out.println("this is even number");
		for (int i = 0; i <=50; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\nthis is odd number");
		for (int i = 0; i <50; i++) {
			if (i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}
}
