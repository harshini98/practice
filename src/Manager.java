
public class Manager extends Employee{
	private int age;
public Manager(int id, String name, int age) {
	super(id, name);
	this.age=age;
}
public String toString() {
	return "Employee ID-" + super.getId() + "|" +
			"Employee Name-" + super.getName() + "|" +
			"Employee Age-" + age + "|";
}
}
