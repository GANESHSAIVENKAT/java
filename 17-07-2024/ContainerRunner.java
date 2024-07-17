public class ContainerRunner{

public static void main(String... args){

Container info=new Container();
System.out.println("Container");
	String[] company_names={"Milta","Eagle","Pure Life"};
	
Container data=new Container("Milta",10000,(short)50,company_names,45.2f);
Container info1=new Container("Eagle",10000,(short)70,company_names,50.2f);
Container collection=new Container("Pure Life",10000,(short)90,company_names,50.2f);
Container details=new Container("Pure Sip",10000,(short)40,company_names,25.2f);



}
}