
public class OrderedListDriver {

	public static void main(String[] args) {
		LinkedOrderedList<Employee> E = new LinkedOrderedList<Employee>();
		E.add(new Employee(123, "Smith", "John"));
		E.add(new Employee(451, "Jones", "Jane"));
		E.add(new Employee(67, "Adams", "Gloria"));
		Employee b = new Employee(333, "Workman", "Adam");
		E.add(b);
		showList(E);
		
		E.add(new Employee(565, "Brown", "Larry"));
		E.add(new Employee(431, "Walker", "Tammy"));
		E.remove(b);
		showList(E);
		
		E.remove(new Employee(565, "", ""));
		E.remove(new Employee(123, "", ""));
		E.remove(new Employee(67, "", ""));
		E.remove(new Employee(451, "", ""));
		E.remove(new Employee(431, "", ""));
		showList(E);
		
	}
	
	public static void showList(LinkedOrderedList<Employee> e) {
		if (!e.isEmpty()) {
			System.out.printf("The list contains %d employees.\n", e.size());
			System.out.println("First entry is: " + e.first());
			System.out.println("Last entry is: " + e.last());
			System.out.println("Full list contains:");
			e.printList();
		}
		else {
			System.out.println("List is empty.");
		}
	}	
}