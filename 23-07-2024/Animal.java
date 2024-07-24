public class Animal{
	public String name;
	public byte age;
	
	public Animal(){
		System.out.println("Default constructor");
	}
	public Animal(String name,byte age){
		this.name=name;
		this.age=age;
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		
	}
	
}