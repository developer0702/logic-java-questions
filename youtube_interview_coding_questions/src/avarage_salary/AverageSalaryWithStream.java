package avarage_salary;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private int empId;
	private String empName;
	private double empSalary;

	public Employee(int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

}

public class AverageSalaryWithStream {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		// Sample data
		employees.add(new Employee(1, "John", 50000.0));
		employees.add(new Employee(2, "Alice", 60000.0));
		employees.add(new Employee(3, "Bob", 75000.0));
		employees.add(new Employee(4, "Eva", 90000.0));

		// Calculate average salary using Stream API
		double averageSalary = employees.stream().mapToDouble(Employee::getEmpSalary).average().orElse(0.0);

		System.out.println("Average Salary: " + averageSalary);
	}
}
