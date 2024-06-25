public class Library {

    public static void main(String[] args) {
     
        String book_name[]  = {"Java", "Python", "C++", "JavaScript"};
        int book_size[]  = {10, 20, 30, 40};
        long book_code[]  = {10000000000L, 20000000000L, 30000000000L};
        char book_section[]  = {'A', 'B', 'C', 'D'};
		 for (int i = 0; i < book_name.length; i++) {
			 
		    System.out.println("Books are as follows:"+book_name[i]);  
		}
		for (int j = 0; j < book_size.length; j++) {
			 
		    System.out.println("Bookssize are as follows:"+book_size[j]);  
		}	
		for (int k = 0; k < book_code.length; k++) {
			 
		    System.out.println("Bookscode are as follows:"+book_code[k]);  
		}
		for (int l = 0; l < book_section.length; l++) {
			 
		    System.out.println("Books section are as follows:"+book_section[l]);  
		}		
    }
      
        
        
    
}