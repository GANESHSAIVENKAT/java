public class Person {
	public static void main(String[] args) {
      
         String name[]= {"Alice", "Bob", "Charlie"};
          int ages[] =  {25, 30, 22};
          long phoneNumbers[] =  {1234567890L, 9876543210L, 5555555555L};
          char initials[] =  {'A', 'B', 'C'};

        for (int i = 0; i < name.length; i++) {
			 
		    System.out.println("Persons are as follows:"+name[i]);  
		}
		for (int j = 0; j < ages.length; j++) {
			 
		    System.out.println("Persons ages are as follows:"+ages[j]);  
		}	
		for (int k = 0; k < phoneNumbers.length; k++) {
			 
		    System.out.println("Persons phoneNumbers are as follows:"+phoneNumbers[k]);  
		}
		for (int l = 0; l < initials.length; l++) {
			 
		    System.out.println("Persons initials are as follows:"+initials[l]);  
		}		
    }
}
