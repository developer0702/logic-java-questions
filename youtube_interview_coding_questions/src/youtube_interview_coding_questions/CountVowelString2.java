package youtube_interview_coding_questions;

import java.util.HashMap;
import java.util.Map;

public class CountVowelString2 {
    public static void main(String[] args) {

        String str = "hgooeejjjdkjkjaeiuw";
        char ch[] = str.toCharArray();
        Map<Character, Integer> vowelCountMap = new HashMap<>();

        for (char c : ch) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    // Increment the count for the current vowel
                    vowelCountMap.put(c, vowelCountMap.getOrDefault(c, 0) + 1);
                    break;
                default:
                    break;
            }
        }

        // Print the count for each vowel
        for (Map.Entry<Character, Integer> entry : vowelCountMap.entrySet()) {
            System.out.println("Count of " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
