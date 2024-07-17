public class Companies{
	public String company_name;
	public int employees;
	public short salary;
	public String[] skills;
	public float skills_req;


public Companies(){
	
}

	
	
public Companies(String company_name,int employees,short salary,String[] skills,float skills_req){
	
	this.company_name=company_name;
	this.employees=employees;
	this.salary=salary;
	this.skills=skills;
	this.skills_req=skills_req;

	System.out.println("Company name is "+company_name);
	System.out.println("Total Employees is "+employees);
	System.out.println("Emp Sal is "+salary);
	System.out.println("Skills Require is "+skills_req);

	for(int i=0;i<skills.length;i++){
			
	System.out.println("skills is "+skills[i]);
	}

	
}

}