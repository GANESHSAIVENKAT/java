public class Vehicle{
	public String name;
	public int price;
	
	public Vehicle(){
		this("Ferari",500000);
		System.out.println("Default Constructor");
	}
	public Vehicle(String name,int price){
		this.name=name;
		this.price=price;
		System.out.println("Company name:"+name);
		System.out.println("Price is ::"+price);
	}
	public Vehicle(String name,int price,byte grade){
		this.name=name;
		this.price=price;
		
		System.out.println("Company name:"+name);
		System.out.println("Price is ::"+price);
		System.out.println("Rating is ::"+grade);
	}

	public String vehicle_details(String name){
		if(name=="Ferari"){
			System.out.println("Carname :"+name);
		}else{
			System.out.println("Carname is not there :");
		}
		return"Found";
	} 
	public String vehicle_details(String name,int price){
		if(price>=500000){
			System.out.println("Carname :"+name);
			System.out.println("Car price :"+price);
		}else{
			System.out.println("Carname is not there :");
		}
		return"Car";
	}
}