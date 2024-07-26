public class ContainerRunner{
	public static void main(String args[]){
	Container.bottle_name1="Eagle";
	System.out.println("Container name is:"+Container.bottle_name1);
	Container.bottle_price1=200;
	System.out.println("Container price is:"+Container.bottle_price1);
	Container.bottle_manufacture_per_Year1=100000L;
	System.out.println("Container man/year is:"+Container.bottle_manufacture_per_Year1);
	Container.bottle_manufacture_Year1=2019;
	System.out.println("Container manufacture in is:"+Container.bottle_manufacture_Year1);
	Container.bottle_rating1=5;
	System.out.println("Container rating is:"+Container.bottle_rating1);
	
	System.out.println("--------------static End--------------");

	
	
	Container info=new Container();
	Container info1=new Container("Eagle",80,100000000L,(short)2021,(byte)5);
	
	}




}





