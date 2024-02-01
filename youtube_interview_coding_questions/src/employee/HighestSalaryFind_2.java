package employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HighestSalaryFind_2 {

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

        // Create a map to store the maximum salary for each employee
        Map<String, Double> maxSalaries = new HashMap<>();

        for (Emp emp : listOfEmp) {
            // Check if the employee's salary is greater than 60000
            if (emp.getEmpSalary() > 60000) {
                // Get the current maximum salary for the employee (if any)
                Double currentMax = maxSalaries.get(emp.getEmpName());

                // Update the maximum salary if the current salary is greater
                if (currentMax == null || emp.getEmpSalary() > currentMax) {
                    maxSalaries.put(emp.getEmpName(), emp.getEmpSalary());
                }
            }
        }

        // Print the result
        System.out.println("Maximum Salaries: " + maxSalaries);
    }
}
