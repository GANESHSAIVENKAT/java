public class OneDriveRunner{
	public static void main(String args[]){
	OneDrive.info();
	OneDrive.info(500000L);
	OneDrive.info((byte)5,500);
	OneDrive.info((byte)5,500,'A');
	OneDrive.info((byte)5,500,true,'A');
	OneDrive.info("OneDrive",(byte)5,500,true,'A');
	OneDrive.info(100000,"OneDrive",(byte)5,500,true,'A');
	OneDrive.info("OneDrive",100000,(byte)5,500.00,(short)500,true,'A');
	OneDrive.info("OneDrive",10.0f,100000,500.00,(short)500,true,'A',(byte)5);
	OneDrive.info("OneDrive",10.0f,10000000L,100000,500.00,(short)200,true,'A',(byte)5);



	
	
	}

}
