public class Employee{
	public String emp_name;
	public int salary;
	
	public Employee(){
		System.out.println("Default Constructor");
	}
	public Employee(String emp_name,int salary){
		this.emp_name=emp_name;
		this.salary=salary;
		System.out.println("Employee Name :"+emp_name);
		System.out.println("Employee Salary :"+salary);
		
		
	}
}