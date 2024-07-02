public class Biriyani{
	
		
		public static void ingridients_details (String ing_names1,String ing_names2,String ing_names3,String ing_names4,String ing_names5,String ing_names6,String ing_names7,String ing_names8,String ing_names9){
		 System.out.println("Ingredients are");
		 System.out.println(ing_names1);
		 System.out.println(ing_names2);
		 System.out.println(ing_names3);
		 System.out.println(ing_names4);
		 System.out.println(ing_names5);
		 System.out.println(ing_names6);
		 System.out.println(ing_names7);
		 System.out.println(ing_names8);
		 System.out.println(ing_names9);

	
		}
		public static void review_details (int review){
			if (review == 10) {
            System.out.println("Wow");
        } else if (review < 10 && review > 5) {
            System.out.println("Good");
        } else if (review <= 5) {
            System.out.println("Worst");
        } 
        
		}
}