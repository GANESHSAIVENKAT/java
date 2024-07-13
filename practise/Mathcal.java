public class Mathcal{

	public static void main (String args[]){
	int count=0;
	int num=31;
	if(num<2){
		System.out.println("This is not prime"+num);
	}else{
		System.out.println("This is prime"+num);
	}
	for(int i=2;i<=num;i++){
		if(num%i==0){
		count++;	
		}
		
	}
	if(count<2){
		System.out.println("This is prime number:"+num);
	}else{
	System.out.println("This is not a prime number:"+num);
	}
	}



}