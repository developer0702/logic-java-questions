package practical_session2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palin {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(24, 32, 2, 32, 124, 1, 11, 1, 4, 6, 35, 32);
		Collections.sort(list);
		
		List<Integer> result=new ArrayList<Integer>();
		for (Integer num : list) {
			result.add(num%2==0?num*num:num);
			
		}

		   System.out.println(result);
	}
}
