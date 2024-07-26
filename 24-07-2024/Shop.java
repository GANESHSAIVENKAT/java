public class Shop{
	
	String shopname[]=new String[6];
	public int index=0;
	
	public int getshopnamelength(){
		return shopname.length;
	}
	public void collection(String element){
		if(this.index<this.getshopnamelength()){
			System.out.println("Not Full");
			
			shopname[index]=element;
			index++;
			
		}else{
			System.out.println("Full");
		}
	}
	public String read(){
		for(int index=0;index<this.getshopnamelength();index++){
			System.out.println(shopname[index]);
		}
		return"Found";
	}
	





}