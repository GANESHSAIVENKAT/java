public class PriceRunner{
	public static void main(String... args){
		
		Price price= new Price();
		int length=price.getarraylength();
		System.out.println(length);
		price.details(200);
		price.details(280);
		price.details(170);
		price.details(900);
		price.details(800);
		price.readvalue();
		
	}

}