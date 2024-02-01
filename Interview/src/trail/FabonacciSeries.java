package trail;

public class FabonacciSeries {

	public static void main(String[] args) {
		int n=10;
		fibo(n);
	}
	
	private static void fibo(int n) {
		int a=0,b=1;
		for (int i = 1; i <=n; i++) {
			System.out.print(a+" ");
			int nextTerm= a+b;
			a=b;
			b=nextTerm;
			
		}
		
	}
}
