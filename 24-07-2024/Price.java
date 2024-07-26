public class Price{

	int price[]=new int[4];
	public int index=0;
	
	public int getarraylength(){
		return price.length;
	}
	public void details(int element){
		if(this.index<this.getarraylength()){
			System.out.println("not full");
			
			price[index]=element;
			index++;
		}else{
			System.out.println("Full");
		}
	}
	public void readvalue(){
		for(int index=0;index<this.getarraylength();index++){
			System.out.println(price[index]);
		}
		
	}

}