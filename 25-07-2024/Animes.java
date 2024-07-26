public class Animes{

	String animeName[] = new String[4];
	public int index =0;
	
	public int getlength(){
		return animeName.length;
	}
	
	public String createbyAnimename(String element){
		if(this.index<this.getlength()){
			animeName[index]=element;
			index++;
		}return	"Cannot update Array";
	}
	public void animereadby(){
		for(int index=0;index<this.getlength();index++){
			System.out.println(animeName[index]);
		}
		
	}
	public String animeupdateby(String oldname,String newname){
		for(int index=0;index<this.getlength();index++){
			if(animeName[index]==oldname){
				animeName[index]=newname;
				System.out.println("Animes Are :"+newname);
				return "updated successfully";
			}
			}return"updatefail";
		}
		public String animedeleteby(String name){
		for(int index=0;index<this.getlength();index++){
			if(animeName[index]==name){
				 animeName[index]=null;
			System.out.println("Animes are :"+animeName[index]);
			return"delete sucessfully";
			}
			
			}
			return"delete not sucess";	
		}
		public String searchByAnimeNames (String names){
			for(String name :animeName ){
			if(names == name){
			return "Found :"+names;
			}
		}
		return "Search result not found";
	}  


}