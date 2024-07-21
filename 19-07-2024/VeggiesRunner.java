public class VeggiesRunner{
	public static void main(String args[]){
	Veggies.vegitable_Name2="Tomato";
	System.out.println("Vegitable name is:"+Veggies.vegitable_Name2);
	Veggies.price2=90;
	System.out.println("Price is:"+Veggies.price2);
	Veggies.crop_size2=10000000L;
	System.out.println("Vegitable Size is:"+Veggies.crop_size2);
	
	System.out.println("--------------static End--------------");

	
	 Veggies product=new  Veggies();
	product.vegitable_Name="Onion";
	System.out.println("Vegitable name is:"+product.vegitable_Name);
	product.price=120;
	System.out.println("Price is:"+product.price);
	product.crop_size=10000000L;
	System.out.println("Vegitable Size is:"+product.crop_size);
	
	}



}





