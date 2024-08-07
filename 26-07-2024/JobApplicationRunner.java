public class JobApplicationRunner {
	public static void main(String[] args) {
	
	JobApplication jobapplication = new JobApplication("Ganesh",22,"Sridhar","VijayaLakshmi","B.tech",8.44f,"Java and WebTechnology","Terralogic",500000,true);
	 System.out.println("Name: " + jobapplication.getName());
     System.out.println("Age: " + jobapplication.getAge());
	 System.out.println("Father Name: " + jobapplication.getFatherName());
	 System.out.println("Mother Name: " + jobapplication.getMotherName());
	 System.out.println("Qualification: " + jobapplication.getQualificationName());
	 System.out.println("Cgpa Obtained: " + jobapplication.getCgpa());
	 System.out.println("Skills obtain: " + jobapplication.getSkillsName());
	 System.out.println("Company Details: " + jobapplication.getCompanyName());
	 System.out.println("Salary Details: " + jobapplication.getSalary());
	 System.out.println("Person selected: " + jobapplication.getSelected());
	jobapplication.setName("Venkat");
    jobapplication.setAge(23);
	jobapplication.setFatherName("Sharma");
	jobapplication.setMotherName("Lakshmi");
	jobapplication.setQualificationName("BE");
	jobapplication.setCgpa(8.8f);
	jobapplication.setSkillsName("Python basics & Webtech");
	jobapplication.setCompanyName("TCS");
	jobapplication.setSalary(700000);
	jobapplication.setSelected(false);
	
	 System.out.println("Name: " + jobapplication.getName());
     System.out.println("Age: " + jobapplication.getAge());
	 System.out.println("Father Name: " + jobapplication.getFatherName());
	 System.out.println("Mother Name: " + jobapplication.getMotherName());
	 System.out.println("Qualification: " + jobapplication.getQualificationName());
	 System.out.println("Cgpa Obtained: " + jobapplication.getCgpa());
	 System.out.println("Skills obtain: " + jobapplication.getSkillsName());
	 System.out.println("Company Details: " + jobapplication.getCompanyName());
	 System.out.println("Salary Details: " + jobapplication.getSalary());
	 System.out.println("Person selected: " + jobapplication.getSelected());
	
	}


}