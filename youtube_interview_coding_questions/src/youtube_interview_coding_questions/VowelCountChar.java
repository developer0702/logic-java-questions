package youtube_interview_coding_questions;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Find vowels from a String element
public class VowelCountChar {

    public static void main(String[] args) {
        String str = "Hello java 8 vowel examples";

        String lowerCase = str.toLowerCase();

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        Map<Character, Long> vowelCounts = lowerCase.chars()
                .mapToObj(c -> (char) c)
                .filter(vowels::contains)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        vowelCounts.forEach((vowel, ch) ->
                System.out.println("Vowel: " + vowel + " =  " + ch));
    }
}

