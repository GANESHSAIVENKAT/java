public class ClothBrandRunner{
	public static void main(String args[]){
		
	ClothBrand brand=new ClothBrand();
	int length=brand.getBrandslength();
	System.out.println(length);
	brand.collection("Puma");
	brand.collection("Clock");
	brand.collection("kanchi");
	brand.collection("Puma");
	brand.read();
	}


}