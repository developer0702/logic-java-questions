package trail2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = "Big black bug bit a big black dog on his big nose";

        Map<String, Long> wordCountMap = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        // Print the word count map
        wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}
