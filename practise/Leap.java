public class Leap{

	public static void main (String args[]){
	
	int num=2024;
	if(num%400==0){
		System.out.println("This is leapyear"+num);
	  }else if(num%4==0 && num%100!=0){
		System.out.println("This is  leapyear"+num);
	}else{
	System.out.println("This is not leapyear"+num);	
	}
	}



}