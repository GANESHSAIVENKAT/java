public class InstagramRunner{
	public static void main(String args[]){
	Instagram.info();
	Instagram.info(500000L);
	Instagram.info((byte)5,500);
	Instagram.info((byte)5,500,'A');
	Instagram.info((byte)5,500,true,'A');
	Instagram.info("Instagram",(byte)5,500,true,'A');
	Instagram.info(100000,"Instagram",(byte)5,500,true,'A');
	Instagram.info("Instagram",100000,(byte)5,500.00,(short)200,true,'A');
	Instagram.info("Instagram",10.0f,100000,500.00,(short)200,true,'A',(byte)5);
	Instagram.info("Instagram",10.0f,10000000L,100000,500.00,(short)200,true,'A',(byte)5);



	
	
	}

}
