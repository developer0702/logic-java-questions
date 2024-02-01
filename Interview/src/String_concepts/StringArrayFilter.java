package String_concepts;


// Q.1 find and check string element when desired string available on given string
public class StringArrayFilter {
    public static void main(String[] args) {
        String[] str = {"sanjay", "vikash", "john", "stallin", "shekhar", "naresh"};

        // Desired strings to filter
        String[] desiredStrings = {"sanjay", "vikash", "john", "krishna"};

        // Iterate through the array and print the desired strings
        for (String s : str) {
            for (String desired : desiredStrings) {
                if (s.equals(desired)) {
                    System.out.print(s + " ");
                   
                }
            }
        }
    }
}

