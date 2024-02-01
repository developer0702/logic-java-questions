package trail;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpTest {
	public static void main(String[] args) {

		List<Emp> employees= getAllEmpData();
		Map<String, Long> collect2 = employees.stream().collect(Collectors.groupingBy(Emp::getGender,Collectors.counting()));
		System.out.println(collect2);
		List<String> collect = employees.stream().map(s->s.getDepartment()).collect(Collectors.toList());
			System.out.println(collect);
		
	}

	private static 
	
	List<Emp> getAllEmpData() {
		// TODO Auto-generated method stub
		
		ArrayList<Emp> emplist= new ArrayList<>();
		emplist.add(new Emp(122,"sanjay","male","sale",10000.0));
		emplist.add(new Emp(122,"rani","female","tester",50000.0));
		emplist.add(new Emp(122,"vijay","male","dev",72000.0));
		return emplist;
	}
}