public class MathCount{  
	public static void main(String args[]){  
	int num[]={0,1,0,1,0,1};
	int	count_zeros=0;
	int	count_ones=0;

	for(int i=0;i<num.length;i++){  
	if(num[i]==0){  
	System.out.println(num[i]); 
		count_zeros++;
		}else{
			System.out.println(num[i]); 
		count_ones++;
		}  
	}
		System.out.println("Zero count is :"+count_zeros);
		System.out.println("Ones count is :"+count_ones);

	}
}  