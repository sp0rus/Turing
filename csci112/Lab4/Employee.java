
public class Employee implements Comparable {
	private Integer empID;					// key
	private String lastName;
	private String firstName;
	
	public Employee (int id, String last, String first) {
		empID = (Integer) id;
		lastName = last;
		firstName = first;
	}
	
	public int compareTo (Object e) {
		Employee employee = (Employee) e;
		return empID.compareTo((Integer) employee.getID());
	}

	public int getID () {
		return empID;
	}
	
	public String toString() {
		return "Employee " + empID + ": " + firstName + " " + lastName;
	}

}
