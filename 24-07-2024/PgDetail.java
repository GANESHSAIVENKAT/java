public class PgDetail{
	public String address;
	public int no_of_rooms;
	public int floors;
	
	
	public void displayInfo(String address){
		 
		System.out.println("Location Name :"+address);
		
	}
	public void displayInfo(String address,int no_of_rooms){
		
		System.out.println("Location Name :"+address);
		System.out.println("Total Number Of Rooms :"+no_of_rooms);
		
	}
	public void displayInfo(String address,int no_of_rooms,int floors){
		 
		System.out.println("Location Name :"+address);
		System.out.println("Total Number Of Rooms :"+no_of_rooms);
		System.out.println("Total Number Of Floors :"+floors);
		
	}
	public PgDetail(){
		this("Brundavanam",89);
	}
	public PgDetail(String address,int no_of_rooms){
		this("Brundavanam",89,5);
		this.address=address;
		this.no_of_rooms=no_of_rooms;
		System.out.println("Location Name :"+address);
		System.out.println("Total Number Of Rooms :"+no_of_rooms);
		
	}
	public PgDetail(String address,int no_of_rooms,int floors){
		this.address=address;
		this.no_of_rooms=no_of_rooms;
		this.floors=floors;
		
		System.out.println("Location Name :"+address);
		System.out.println("Total Number Of Rooms :"+no_of_rooms);
		System.out.println("Total Number Of Floors :"+floors);
	}
}