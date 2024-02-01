package employee;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;


//highest salary>60000
public class HighestSalaryFind {

    public static void main(String[] args) {
        ArrayList<Emp> listOfEmp = new ArrayList<>();
        listOfEmp.add(new Emp(112, "sanjay", "sanjay@gmail.com", 90000.0, "HR", "male"));
        listOfEmp.add(new Emp(145, "vikash", "vikash@gmail.com", 30000.0, "Dev", "male"));
        listOfEmp.add(new Emp(124, "ranjit", "ranjit@gmail.com", 40000.0, "Store", "male"));
        listOfEmp.add(new Emp(156, "sonu", "sonu@gmail.com", 50000.0, "HR", "Assy"));
        listOfEmp.add(new Emp(179, "rakhi", "rakhi@gmail.com", 290000.0, "HR", "Tester"));
        listOfEmp.add(new Emp(133, "rashmi", "rashi@gmail.com", 66000.0, "HR", "Designer"));
        listOfEmp.add(new Emp(146, "soniya", "soniya@gmail.com", 89000.0, "HR", "production"));
        listOfEmp.add(new Emp(196, "priyam", "priyam@gmail.com", 75000.0, "HR", "sell"));

        Map<String, Double> collect = listOfEmp.stream()
                .filter(emp -> emp.getEmpSalary() > 80000)  // Filter employees with salary > 60000
                .collect(Collectors.groupingBy(Emp::getEmpName, Collectors.summarizingDouble(Emp::getEmpSalary)))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().getMax()));
        
        System.out.println(collect);
    }
}
