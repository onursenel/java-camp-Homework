
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		employee.firstName="onur";
		
		EmployeeManager employeeManager=new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		employeeManager.BestEmployee();
		
	}

}
