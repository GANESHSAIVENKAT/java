public class Branch{

	public static void main (String args[]){
	int counteven=0;
	int countodd=0;
	for(int i=1;i<=50;i++){
	if(i%2==0){
		
		counteven++;
	}else{
		
		countodd++;
	}
	
	}
	System.out.println("even count"+counteven);
	System.out.println("odd count"+countodd);	

	}


}