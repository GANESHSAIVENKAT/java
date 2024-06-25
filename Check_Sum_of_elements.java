public class Check_Sum_of_elements{
	public static void main(String args[]){
		int marks_of_students[]={90, 95, 85, 88, 100};
		int sum=0;
		for(int i=0;i<marks_of_students.length;i++){
			sum = sum+marks_of_students[i];
		
		}
		System.out.println("The Sum Of Elements is:"+sum);
	}
}