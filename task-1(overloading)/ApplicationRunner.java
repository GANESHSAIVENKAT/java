public class ApplicationRunner{
	public static void main(String args[]){
	Application.info();
	Application.info((byte)5);
	Application.info(5,500.00);
	Application.info(5,500.00,'A');
	Application.info(5,500.00,true,'A');
	Application.info("ClashOfClans",5,500.00,true,'A');
	Application.info((byte)100,"ClashOfClans",5,500.00,true,'A');
	Application.info("ClashOfClans",(byte)100,(int)5,500.00,(short)20,true,'A');
	Application.info("ClashOfClans",10.0f,(byte)100,500.00,(short)20,true,'A',(int)5);
	Application.info("ClashOfClans",10.0f,10000000L,(byte)100,500.00,(short)20,true,'A',(int)5);



	
	
	}

}
