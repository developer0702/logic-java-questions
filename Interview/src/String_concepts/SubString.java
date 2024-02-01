package String_concepts;

// use substring that means where to start element
// if you want get element from using limitation
// use IgnoreCase
public class SubString {

	public static void main(String[] args) {
		String str = "mike is used for transmission of Sound";
		
		//start from
		System.out.println(str.substring(6));
		
		//use limitation
		System.out.println(str.substring(4,20));
		
		//use Ignore case
		System.out.println(str.equalsIgnoreCase("S"));
	}
}
