import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee
{
	 int id;
	 String name;
	 long salary;
	 String department;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, long salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
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
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
}
public class TestJava8 {
public static void main(String[] args) {
	ArrayList<Employee>e=new ArrayList<>();
	e.add(new Employee(11,"Marish",78522,"IT"));
	e.add(new Employee(12,"Vaibhav",60000,"HR"));
	e.add(new Employee(14,"Pranav",365463,"HR"));
	e.add(new Employee(15,"Rushikesh",726532,"Networking"));
	e.add(new Employee(13,"Shree",45000,"AI"));
	e.add(new Employee(16,"Vishwjit",882200,"Digital mrketing"));
	
//	
//	List<Employee>Highsalary=e.stream().filter(e1->e1.salary > 45000).collect(Collectors.toList());
//	System.out.println(Highsalary);
//	
	
//	//unique department
//	e.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
//	
//	//sorting salary
//	List<Employee>sortedList=e.stream().sorted((e1,e2)->e1.salary > e2.salary ? -1 : 1).collect(Collectors.toList());
//	System.out.println(sortedList);
	
	//findFirst
	Optional<Employee> first=e.stream().findFirst();
	System.out.println(first);
	
	Optional<Employee> any=e.stream().findAny();
	System.out.println(any);
	
}
}
