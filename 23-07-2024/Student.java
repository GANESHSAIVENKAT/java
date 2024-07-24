public class Student{
	public String studentname;
	public char grade;
	
	
	public Student(){
		System.out.println("Default constructor");
	}
	public Student(String studentname,char grade){
		this.studentname=studentname;
		this.grade=grade;
		System.out.println("Student Name :"+studentname);
		System.out.println("Grade :"+grade);
	}
	public void displayInfo(){
		 String studentname="Ganesh";
		 char grade='A';
		System.out.println("Student Name :"+studentname);
		System.out.println("Grade :"+grade);
	}
}