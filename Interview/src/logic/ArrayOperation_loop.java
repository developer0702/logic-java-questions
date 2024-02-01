package logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Map operations on elements using loops
public class ArrayOperation_loop {

	public static void main(String[] args) {
	
		List<Integer> asList = Arrays.asList(2,3,4,4,56,6);
		
		List<Integer> result= new ArrayList<Integer>();
		for (Integer num : asList) {
			int value=num%2==0?num*num:num;
			result.add(value);
		}
		System.out.println(result);
		
	}
}
