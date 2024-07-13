public class Casio{

	public static void main (String args[]){
	long num=9876543210L;
	
	long reverse=0L;
	while(num!=0){
	long rem=num%10;
	reverse=reverse*10+rem;
	num=num/10;
		
	}
		System.out.println("Reverse"+reverse);

	}

}