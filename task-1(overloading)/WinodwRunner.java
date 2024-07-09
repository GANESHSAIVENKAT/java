public class WinodwRunner{
	public static void main(String args[]){
	Winodw.info();
	Winodw.info(10000000L);
	Winodw.info((byte)5,500.20);
	Winodw.info((byte)5,500.20,'A');
	Winodw.info((byte)5,500.20,true,'A');
	Winodw.info("Plus",(byte)5,500.20,true,'A');
	Winodw.info(10,"Plus",(byte)5,500.20,true,'A');
	Winodw.info("Plus",10,(byte)5,500.20,(short)500,true,'A');
	Winodw.info("Plus",100.0f,10,500.20,(short)500,true,'A',(byte)5);
	Winodw.info("Plus",100.0f,10000000L,10,500.20,(short)200,true,'A',(byte)5);



	
	
	}

}
