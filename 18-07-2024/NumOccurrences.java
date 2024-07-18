public class NumOccurrences{  
	public static void main(String args[]){  
	int num[]={0,12,0,11,0,10};
	int	count_zeros=0;
	

	for(int i=0;i<num.length;i++){  
	if(num[i]==0){  
	System.out.println(num[i]); 
		count_zeros++;
		}  
	}
		System.out.println("Zero occurance is :"+count_zeros);
		

	}
}  