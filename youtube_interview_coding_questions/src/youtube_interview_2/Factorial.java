package youtube_interview_2;

// find n no of factorial
public class Factorial {
	public static void main(String[] args) {

		System.out.println("Enter your factorial number");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int n = 4;
		long factorial = 1;

		// Start the loop from 1
		for (int i = 1; i <= n; i++) {
			// Multiply the current value of factorial by i
			factorial *= i;
		}

		System.out.println("Factorial of " + n + " is: " + factorial);
//		sc.close();
	}
}
