public class Library{
	public String address;
	public String lib_name;
	public int price_start;
	
	public Library(){
		this("Brindavanam");
		System.out.println("Default Constructor");
	}
	public Library(String address){
		this("Brindavanam","Saraswathi",4);
		this.address=address;
		
		System.out.println("Address Name :"+address);
		
		
		
	}
	public Library(String address,String lib_name,int price_start){
		this.address=address;
		this.lib_name=lib_name;
		this.price_start=price_start;
		
		System.out.println("Address Name :"+address);
		System.out.println("Library Name :"+lib_name);
		System.out.println("Prices Start from :"+price_start);
		
		
		
	}
}