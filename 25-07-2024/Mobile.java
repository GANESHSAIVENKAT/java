public class Mobile{

	String mobileName[] = new String[4];
	public int index =0;
	
	public int getlength(){
		return mobileName.length;
	}
	
	public String createbyMobilename(String element){
		if(this.index<this.getlength()){
			mobileName[index]=element;
			index++;
		}return	"Cannot update Array";
	}
	public void mobilereadby(){
		for(int index=0;index<this.getlength();index++){
			System.out.println(mobileName[index]);
		}
		
	}
	public String mobileupdateby(String oldname,String newname){
		for(int index=0;index<this.getlength();index++){
			if(mobileName[index]==oldname){
				mobileName[index]=newname;
				System.out.println("Mobile Are :"+newname);
				return "updated successfully";
			}
			}return"updatefail";
		}
		public String mobiledeleteby(String name){
		for(int index=0;index<this.getlength();index++){
			if(mobileName[index]==name){
				 mobileName[index]=null;
			System.out.println("Mobile are :"+mobileName[index]);
			return"delete sucessfully";
			}
			
			}
			return"delete not sucess";	
		}
		public String searchByMobileNames (String names){
			for(String name :mobileName ){
			if(names == name){
			return "Found :"+names;
			}
		}
		return "Search result not found";
	}  


}