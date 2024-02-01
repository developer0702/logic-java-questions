package logic;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char ans = FindNoReapeatChar.highestOccuringChar(str);
		System.out.println(ans);

	}
}
