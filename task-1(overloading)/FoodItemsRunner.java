public class FoodItemsRunner{
	public static void main(String args[]){
	FoodItems.info();
	FoodItems.info(3000000L);
	FoodItems.info((byte)5,50000);
	FoodItems.info((byte)5,50000,'A');
	FoodItems.info((byte)5,50000,false,'A');
	FoodItems.info("Yeppiee",(byte)5,50000,false,'A');
	FoodItems.info(150,"Yeppiee",(byte)5,50000,false,'A');
	FoodItems.info("Yeppiee",150,(byte)5,50000,(short)320,false,'A');
	FoodItems.info("Yeppiee",100.0f,150,50000,(short)320,false,'A',(byte)5);
	FoodItems.info("Yeppiee",100.0f,3000000L,150,50000,(short)320,false,'A',(byte)5);



	
	
	}

}
