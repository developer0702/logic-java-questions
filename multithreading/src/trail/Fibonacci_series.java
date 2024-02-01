package trail;

public class Fibonacci_series {

	public static void main(String[] args) {
		
		int n=10;
		generateFib(n);
	}
	private static void generateFib(int n) {
		int a=0,b=1;
		for (int i = 0; i < n; i++) {
			System.out.print(a+" ");
			int nextTerm=a+b;
			a=b;
			b=nextTerm;
			
		}
	}
}
