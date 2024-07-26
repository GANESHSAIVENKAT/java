public class Movies{

	String movieName[]=new String[4];
	public int index=0;
	
	public int getlength(){
		return movieName.length;
	}
	public String createbyMoviename(String element){
		if(this.index<this.getlength()){
			movieName[index]=element;
			index++;
		}return	"Cannot update Array";
	}
	public void moviereadby(){
		for(int index=0;index<this.getlength();index++){
			System.out.println(movieName[index]);
		}
		
	}
	public String movieupdateby(String oldname,String newname){
		for(int index=0;index<this.getlength();index++){
			if(movieName[index]==oldname){
				oldname=newname;
				System.out.println("Movies Are :"+newname);
				return "updated successfully";
			}
			}return"updatefail";
		}
		public String moviedeleteby(String name){
		for(int index=0;index<this.getlength();index++){
			if(movieName[index]==name){
				 movieName[index]=null;
			System.out.println("Movies are :"+movieName[index]);
			return"delete sucessfully";
			}
			
			}
			return"delete not sucess";	
		}
		public String searchByMovieNames (String names){
for(String name :movieName ){
	if(names == name){
		return "Found :"+names;
	}
}
return "Search result not found";
} 
}