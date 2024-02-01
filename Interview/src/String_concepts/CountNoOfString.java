package String_concepts;

//count no of words of string in java
//print characters
public interface CountNoOfString {

	public static void main(String[] args) {
		String str = "pankaj sir academy";
		System.out.println(str.length());
		System.out.println(str.toString());
		
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
