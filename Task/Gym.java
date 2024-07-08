public class Gym{
	public static void gymdetail(){
	String gym_Name="Nargarjuna Gym";
	System.out.println("Gym name is:"+gym_Name);
	}
	public static void gymdetail(String type, int number){
	System.out.println(" Detail:"+type);
	System.out.println("Exercise Learners:"+number+"members.");		
		
	}
	public static String gymdetail(String location){
		
	    System.out.println("Location is:"+location);
	return "End";		
		
	}
	public static void gymdetail(int weights[]){
    for(int index=0;index<weights.length;index++){
    System.out.println("List of weights are:"+weights[index]);
 }
}



}