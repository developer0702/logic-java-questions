package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Mycomparable  {

	  public static void main(String[] args) {
		ArrayList<Emp>  list = new ArrayList<Emp>();
		list.add(new Emp(15,"john"));
		list.add(new Emp(12,"bablu"));
		list.add(new Emp(13,"vikash"));
		list.add(new Emp(14,"ranjeet"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
