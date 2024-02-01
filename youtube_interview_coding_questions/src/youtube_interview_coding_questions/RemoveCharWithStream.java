package youtube_interview_coding_questions;

import java.util.stream.Collectors;

public class RemoveCharWithStream {

    // remove duplicate char from string using Java Stream API
    public static void main(String[] args) {
        String str = "aabbcdeefggrrskhlpoyes";
       String removeString = removeString(str);
       System.out.println(removeString);
    }

    private static String removeString(String str) {
        return str.chars()
                  .distinct() // remove duplicates
                  .mapToObj(c -> String.valueOf((char) c)) // convert int to char and then to String
                  .collect(Collectors.joining()); // join the characters to form the final string
    }
    
}
