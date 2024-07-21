public class FruitsRunner{
	public static void main(String args[]){
	Fruits.fruit_Name2="Apple";
	System.out.println("Fruits name is:"+Fruits.fruit_Name2);
	Fruits.price2=600;
	System.out.println("Price is:"+Fruits.price2);
	Fruits.crop_size2=10000000L;
	System.out.println("Fruits Size is:"+Fruits.crop_size2);
	
	System.out.println("--------------static End--------------");

	
	 Fruits product=new  Fruits();
	product.fruitName="Mango";
	System.out.println("Fruits name is:"+product.fruitName);
	product.price=500;
	System.out.println("Price is:"+product.price);
	product.crop_size=10000000L;
	System.out.println("Fruits Size is:"+product.crop_size);
	
	}



}





