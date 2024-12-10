
public class Employee {
	// Fields
	private String firstName;
	private String lastName;
	private int employeeID;
	private double salary;
	
	// Constructor
	public Employee() {
		// Initialize salary to zero
		this.salary = 0.0;
	}
	
	// Setters and Getters
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	// Employee summary method
	public void employeeSummary() {
		System.out.println("Employee Summary:");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Salary: $" + salary);
		
		
	}

}
