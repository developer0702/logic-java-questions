package interview_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpTest {
	public static void main(String[] args) {

		List<Emp> empRecord = getAllEmployee();
		Map<String, Long> collect2 = empRecord.stream()
				.collect(Collectors.groupingBy(Emp::getGender, Collectors.counting()));
		System.out.println(collect2);
		List<String> collect = empRecord.stream().map(s -> s.getDepartment()).collect(Collectors.toList());
		System.out.println(collect);
	}

	private static List<Emp> getAllEmployee() {
		ArrayList<Emp> emplist = new ArrayList<>();
		emplist.add(new Emp(112, "sanjay", "male", "developer", 70000.0));
		emplist.add(new Emp(110, "rani", "female", "sales", 75000.0));
		emplist.add(new Emp(210, "babita", "female", "HR", 80000.0));
		emplist.add(new Emp(213, "raju", "male", "Tester", 40000.0));
		emplist.add(new Emp(225, "minu", "female", "Designer", 60000.0));
		emplist.add(new Emp(221, "aditya", "male", "ClientHandler", 30000.0));
		emplist.add(new Emp(150, "sonu", "male", "administrater", 90000.0));
		return emplist;
	}
}
