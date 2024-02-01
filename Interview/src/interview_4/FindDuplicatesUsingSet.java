package interview_4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesUsingSet {

	
	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 2, 5, 1, 2, 4, 5, 4, 4, 4, 6);

        // Method 1: Using Set
        findDuplicatesUsingSet(list);
	}

	private static void findDuplicatesUsingSet(List<Integer> list) {


		 Set<Integer> uniqueElements = new HashSet<>();
	        Set<Integer> duplicates = new HashSet<>();

	        for (Integer num : list) {
	            if (!uniqueElements.add(num)) {
	                duplicates.add(num);
	            }
	        }

	        System.out.println("Duplicates using Set: " + duplicates);
	    }

	}

