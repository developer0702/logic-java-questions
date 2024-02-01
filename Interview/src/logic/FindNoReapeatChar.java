package logic;

//find non repeating character
public class FindNoReapeatChar {
	public static char highestOccuringChar(String str) {
		int[] arr= new int[256];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]+=1;
			
		}
		int max =-1;
		char ch=' ';
		for (int i = 0; i < str.length(); i++) {
			if (max<arr[str.charAt(i)]) {
				max=arr[str.charAt(i)];
				ch=str.charAt(i);
			}
		}
		return ch;
	}

}
