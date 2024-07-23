public class Marriage{

	public String name;
	public int age;
	public String qualification;
	public float height;
	
	public Marriage(){
		System.out.println("Marriage details");
		
	}
	public Marriage(String name,int age,String qualification,float height){
		this.name=name;
		this.age=age;
		this.qualification=qualification;
		this.height=height;
		
	}
	
		
		            
	
	public String profile_details(String name){
		if(this.name=="Vaasanthi"){
			System.out.println("Bridename :"+this.name);
		}else{
			System.out.println("Bride Not Found");
		}
		return"Found";
	}
	public String profile_details(String name,int age){
		if(age<=20){
			System.out.println("Bridename :"+this.name);
			System.out.println("Bride age :"+age);
		}else{
			System.out.println("Bride Not Found");
		}
		return"Found";
	}
	public String profile_details(String name,int age,float height){
		if(this.height<=5.0f){
			System.out.println("Bridename :"+this.name);
			System.out.println("Bride age :"+this.age);
			System.out.println("Bride height :"+this.height);
		}else{
			System.out.println("Bride Not Found");
		}
		return"Found";
	}
	public String profile_details(String name,int age,String qualification,float height){
		if(this.qualification=="Btech"){
			System.out.println("Bridename :"+this.name);
			System.out.println("Bride age :"+this.age);
			System.out.println("Bride Qualification :"+this.qualification);
			System.out.println("Bride height :"+this.height);
		}else{
			System.out.println("Bride Not Found");
		}
		return"Found";
	}
	



}