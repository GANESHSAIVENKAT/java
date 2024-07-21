public class GroceryItemRunner{
	public static void main(String args[]){
	GroceryItem.itemName2="Cornflor";
	System.out.println("Item name is:"+GroceryItem.itemName2);
	GroceryItem.itemPrice2=600;
	System.out.println("Item price is:"+GroceryItem.itemPrice2);
	GroceryItem.crop_size2=10000000L;
	System.out.println("Item Size is:"+GroceryItem.crop_size2);
	
	System.out.println("--------------static End--------------");

	
	 GroceryItem product=new  GroceryItem();
	product.itemName="Cornflor";
	System.out.println("Item name is:"+product.itemName);
	product.itemPrice=600;
	System.out.println("Item price is:"+product.itemPrice);
	product.crop_size=10000000L;
	System.out.println("Item CropSize is:"+product.crop_size);
	
	}



}





