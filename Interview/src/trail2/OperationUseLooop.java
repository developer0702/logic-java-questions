package trail2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperationUseLooop {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,4,5,6,7);
		List<Integer> list2=loopOperation(list);
		System.out.println(list2);
	}
	
	private static List<Integer> loopOperation(List<Integer> list){
		List<Integer> result = new ArrayList<Integer>();
		for (Integer num : list) {
			int value=num%2==0?num*num:num;
			result.add(value);
		}
		return result;
	}
}
