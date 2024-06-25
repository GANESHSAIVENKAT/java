public class Check_Even_or_Odd{
	public static void main(String args[]){
		int num[]={90, 95, 88,100,76,89};
		int evencount=0;
		int oddcount=0;
	
		for(int i=0;i<num.length;i++){
			if(num[i]%2==0){
				evencount++;
			System.out.println( "even numbers are "+num[i]);
			}else{
				oddcount++;
				System.out.println( "odd numbers are "+num[i]);
			}
			
		
		}
		System.out.println("Count of even numbers: " + evencount++);
        System.out.println("Count of odd numbers: " + oddcount++);
	}
}