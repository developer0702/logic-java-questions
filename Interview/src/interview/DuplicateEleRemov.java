package interview;


import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

// Map operation without stream API
public class DuplicateEleRemov {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,2,4,5,6,7,3,8);

        Collections.sort(list);
        // Create a new list to store the result
        List<Integer> result = new ArrayList<>();

     
        // Iterate through the original list and perform the mapping operation
        for (Integer value : list) {
            result.add(value%2==0?value*value:value);
        }

        // Print the result
        System.out.println(result);
    }
}

