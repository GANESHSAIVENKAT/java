public class MobileRunner{
public static void main(String[] args){
Mobile mobile = new Mobile();
int length = mobile.getlength();
		System.out.println("length is:"+length);
		mobile.createbyMobilename("Redmi");
		mobile.createbyMobilename("Realme");
		mobile.createbyMobilename("Asus");
		mobile.createbyMobilename("Micromax");
		mobile.createbyMobilename("Apple");
		mobile.mobilereadby();
		System.out.println("----------update--------");
		mobile.mobileupdateby("Redmi","Poco");
		mobile.mobilereadby();
		System.out.println("----------delete--------");
		mobile.mobiledeleteby("Realme");
		mobile.mobilereadby();
		System.out.println("----------search--------");
		String mobiles = mobile.searchByMobileNames("Samsung");
		System.out.println(mobiles);
		mobile.mobilereadby();
 }
}
