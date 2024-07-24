public class Person{
	public String firstname;
	public String lastname;
	
	public Person(){
		System.out.println("Default constructor");
	}
	public Person(String firstname,String lastname){
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println(firstname+lastname);
		
		
	}
	
}