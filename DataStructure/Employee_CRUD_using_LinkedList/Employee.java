package Employee_list;

public class Employee {
	//members of the class
	private int id;
	private String name;
	private String gender;
	private double salary;
	
	//self referancing node
	Employee next;
	
	//constructor
	public Employee() {
		this.id=0;
		this.name=null;
		this.gender=null;
		this.salary=0;
		this.next=null;
	}
	
	//getter and setters for all variables except self referencing node
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//to print the object
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
}
