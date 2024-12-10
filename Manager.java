
public class Manager extends Employee {
	// Field
	private String department;
	
	// Constructor
	public Manager() {
		super(); // Call the superclass constructor
	}
	
	// Setter and Getter for department
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	// Overriding employeeSummary method
	@Override
	public void employeeSummary() {
		// Call the superclass method to print Employee details
		super.employeeSummary();
		// Print the Manager-specific details
		System.out.println("Department: " + department);
	}

}
