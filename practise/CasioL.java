public class CasioL{

	public static void main (String args[]){
	long num=9876543210L;
	
	long reverse=0L;
	for (int i=1;i<num;i++){
	long rem=num%10;
	reverse=reverse*10+rem;
	num=num/10;
		
	}
		System.out.println("Reverse"+reverse);

	}

}