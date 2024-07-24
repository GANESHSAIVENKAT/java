public class Employees{
	public String name;
	public int salary;
	public String department;
	
	public Employees(){
		this("Ramu",100000);
		System.out.println("Default constructor");
	}
	public Employees(String name,int salary){
		this("Ramu",100000,"Developer");
		this.name=name;
		this.salary=salary;
		System.out.println("Book Name :"+name);
		System.out.println("Authorname :"+salary);
		
		
	}
	public Employees(String name,int salary,String department){
		
		this.name=name;
		this.salary=salary;
		this.department=department;
		System.out.println("Book Name :"+name);
		System.out.println("Authorname :"+salary);
		System.out.println("Department"+department);
		
		
	}
	
}