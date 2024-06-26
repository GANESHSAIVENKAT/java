public class Placements {

    public static void main(String[] args) {
        // Declare and initialize arrays of different types
        String[] nameofcompany = {"Apple", "Google", "Microsoft","Terralogic"};
        int[] total_workers = {10080, 20057, 30960, 47080, 59797};
        long[] companycontact = {10000000000L, 20000000000L, 30000000000L};
    
		
		 for (int i = 0; i < nameofcompany.length; i++) {
			 
		    System.out.println("Company Names are as follows:"+nameofcompany[i]);  
		}
		for (int j = 0; j < total_workers.length; j++) {
			 
		    System.out.println("No of Workers are as follows:"+total_workers[j]);  
		}	
		for (int k = 0; k < companycontact.length; k++) {
			 
		    System.out.println("Company contacts are as follows:"+companycontact[k]);  
		}
		
    }
}	