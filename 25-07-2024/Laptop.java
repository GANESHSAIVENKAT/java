public class Laptop{

	String laptopName[]=new String[4];
	public int index=0;
	
	public int getlength(){
		return laptopName.length;
	}
	public String createbyLaptopname(String element){
		if(this.index<this.getlength()){
			laptopName[index]=element;
			index++;
		}return	"Cannot update Array";
	}
	public void laptopreadby(){
		for(int index=0;index<this.getlength();index++){
			System.out.println(laptopName[index]);
		}
		
	}
	public String laptopupdateby(String oldname,String newname){
		for(int index=0;index<this.getlength();index++){
			if(laptopName[index]==oldname){
				laptopName[index]=newname;
				System.out.println("Laptop Are :"+newname);
				return "updated successfully";
			}
			}return"updatefail";
		}
		public String laptopdeleteby(String name){
		for(int index=0;index<this.getlength();index++){
			if(laptopName[index]==name){
				 laptopName[index]=null;
			System.out.println("Laptop are :"+laptopName[index]);
			return"delete sucessfully";
			}
			
			}
			return"delete not sucess";	
		}
		public String searchByLaptopNames (String names){
			for(String name :laptopName ){
			if(names == name){
			return "Found :"+names;
			}
		}
		return "Search result not found";
	} 
}