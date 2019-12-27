
public class EmployeeMain {
	public void print(Employee[] emp) {
		for(int i=0; i<emp.length; i++) {
			System.out.println("Employee ID" + "-" + emp[i].getId() + "|" +
								"Employee Name" + "-" + emp[i].getName() + "|" + 
								"Employee Balance" + "-" + emp[i].getBalance());
		}
	}
public static void main(String[] args) {
	Employee[] employee = {new Employee(1, "myra"), 
			new Employee(2, "mira"),
			new Employee(3, "mahi"),
			new Employee(4, "madhu"),
			new Employee(5, "bala")
			};
	employee[0].addSalary(56789.991);
	employee[1].addSalary(10098.090);
	employee[2].addSalary(34544);
	employee[3].addSalary(3456768);
	employee[4].addSalary(2435657);
	
	EmployeeMain e = new EmployeeMain();
	Manager m = new Manager(6, "amaira", 35);
	System.out.println(m + "Employee Balance-" + m.addSalary(56780.987));
	
	e.print(employee);
	
}
}
