package trail;

public class OddAndE {
	public static void main(String[] args) {

		int n=100;
		System.out.println("even number");
		for (int i = 0; i <n; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\nodd number");
		for (int i = 0; i < n; i++) {
			if (i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}
	
}
