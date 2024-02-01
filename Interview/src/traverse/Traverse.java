package traverse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traverse {

	public static void main(String[] args) {
		ArrayList<String> listStr = new ArrayList<>();
		listStr.add("ram");
		listStr.add("shyam");
		listStr.add("vikash");
		listStr.add("amit");

		//Iteration by using for loop
		for (int i = 0; i < listStr.size() - 1; i++) {
			System.out.print(listStr.get(i) + " ");
		}

		System.out.println("\n************************");

		// Iteration using for each loop

		for (String string : listStr) {

			System.out.println(string);
		}

		System.out.println("************");

		// Iteration using iterator

		Iterator<String> itr = listStr.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
		}
		System.out.println("***************");

		// Iteration using listIterater - forward

		ListIterator<String> listIterator = listStr.listIterator();

		while (listIterator.hasNext()) {
			String nextIterator = (String) listIterator.next();
			System.out.println(nextIterator);
		}
		System.out.println("************************");

		// listIterator - backward directions

		ListIterator<String> listIterator2 = listStr.listIterator(listStr.size());
		while (listIterator2.hasPrevious()) {
			String string = (String) listIterator2.previous();
			System.out.println(string);

		}
	}
}
