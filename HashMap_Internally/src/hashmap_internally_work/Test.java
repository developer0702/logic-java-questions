package hashmap_internally_work;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		HashMap<String, Integer> friends = new HashMap<>();
		friends.put("ankit", 25);
		friends.put("ankit", 30);
		friends.put("stallin", 23);
		System.out.println(friends);
	}
}