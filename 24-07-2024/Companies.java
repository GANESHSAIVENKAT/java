public class Companies{

	String companyName[]=new String[4];
	public int index=0;
	
	public int getlength(){
		return companyName.length;
	}
	public void insertbycompany(String element){
		if(this.index<this.getlength()){
			System.out.println("Found");
			companyName[index]=element;
			index++;
		}else{
			System.out.println("Not found");
		}	
	}
	public String companyreadby(){
		for(int index=0;index<this.getlength();index++){
			System.out.println(companyName[index]);
		}
		return "found";
	}
	public void companyupdateby(String oldname,String newname){
		for(int index=0;index<this.getlength();index++){
			if(companyName[index]==oldname){
				oldname=newname;
				System.out.println(newname);
			}
			}
		}
		public String companydeleteby(String name){
		for(int index=0;index<this.getlength();index++){
			if(companyName[index]==name){
				 companyName[index]=null;
			
			}
			
			}
			return "Error";	
		}
		public String companysearchby(String companyname){
			for(int index=0;index<this.getlength();index++){
				if(companyName[index]==companyname){
					return "Companyname Successful"+companyname;
				}
			}
			return "Error";
		}
		
}

