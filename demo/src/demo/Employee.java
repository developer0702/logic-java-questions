package demo;

import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee {

    public static void main(String[] args) {
        String str = "MINIMUM";

        HashMap<Character, Integer> charCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(
                        Function.identity(),
                        c -> 1,
                        Integer::sum,
                        HashMap::new
                ));

        System.out.println(charCount);
    }
}
