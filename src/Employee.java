
public class Employee {
private int id;
private String name;
private double balance;
public Employee() {}
public Employee(int id, String name) {
	this.id=id;
	this.name=name;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public double getBalance() {
	return balance;
}
public double addSalary(double salary) {
	balance += salary;
	return balance;
}
}
