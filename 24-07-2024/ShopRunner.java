public class ShopRunner{
	public static void main(String args[]){
		
	Shop name=new Shop();
	int length=name.getshopnamelength();
	System.out.println(length);
	name.collection("D Mart");
	name.collection("Amazon");
	name.collection("Flipcart");
	name.collection("Mytra");
	name.collection("UrbanHeaven");
	name.collection("ShopNest");
	name.read();
	}


}