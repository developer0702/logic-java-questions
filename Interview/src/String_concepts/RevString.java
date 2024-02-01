package String_concepts;

//find reverse string in java
public class RevString {
	public static void main(String[] args) {

		String str= "pakanj";
		for (int i = str.length()-1; i >0; i--) {
			System.out.print(str.charAt(i)+" ");
		}
	}
}
