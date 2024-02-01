package String_concepts;


//remove empty space 
public class Trim {

	public static void main(String[] args) {
		String str ="  mike is used for transmission of sound  ";
		//it used  to find out from this letter start or not it gives in boolean form
		System.out.println(str.startsWith("u"));
		
	//	it is converted into upper case and remove empty space of origin and end
		System.out.println(str.trim().toUpperCase());
		
		
		
	}
}
