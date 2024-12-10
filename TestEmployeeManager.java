
public class TestEmployeeManager {

	public static void main(String[] args) {
		// Create an Employee object
		Employee employee = new Employee();
		employee.setFirstName("John");
		employee.setLastName("Doe");
		employee.setEmployeeID(1001);
		
		// Display employee details
		employee.employeeSummary();
		System.out.println();
		
		// Create a Manager object
		Manager manager = new Manager();
		manager.setFirstName("Jane");
		manager.setLastName("Smith");
		manager.setEmployeeID(2001);
		manager.setDepartment("HR");
		
		// Display manager details (calls overridden employeeSummary)
		manager.employeeSummary();

	}

}
