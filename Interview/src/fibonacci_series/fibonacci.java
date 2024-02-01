package fibonacci_series;

//Java program for Fibonacci Series using Space
//Optimized Method
public class fibonacci {

	public static void main(String[] args) {
		int n=10;
		fibonacciSeries(n);
		
	}
	
	private static void fibonacciSeries(int n) {
		int a=0,b=1;
		for (int i = 1; i <n; i++) {
			System.out.print(a+" ");
			int nextTerm=a+b;
			a=b;
			b=nextTerm;
		}
	}
}
