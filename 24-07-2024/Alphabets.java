public class Alphabets{

	char alphabet[]=new char[10];
	public int index=0;
	
	public int getarraylength(){
		return alphabet.length;
	}
	public void details(char element){
		if(this.index<this.getarraylength()){
			System.out.println("not full");
			
			alphabet[index]=element;
			index++;
		}else{
			System.out.println("Full");
		}
	}
	public void read(){
		for(int index=0;index<this.getarraylength();index++){
			System.out.println(alphabet[index]);
		}
		
	}

}