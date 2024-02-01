package trail;

public class Emp {

	private int empId;
	private String empName;
	private String gender;
	private String department;
	private Double salary;
	
	

	public Emp(int empId, String empName, String gender, String department, Double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", gender=" + gender + ", department=" + department
				+ ", salary=" + salary + "]";
	}

}