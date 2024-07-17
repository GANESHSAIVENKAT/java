public class VegitablesRunner{

public static void main(String... args){

Vegitables info=new Vegitables();
System.out.println("Vegitables");
	String[] vegitable_names={"Tamato","Potato","Califlower"};
	
Vegitables data=new Vegitables("Tamato",10000,(short)50,vegitable_names,45.2f);
Vegitables info1=new Vegitables("Potato",10000,(short)70,vegitable_names,50.2f);
Vegitables collection=new Vegitables("Califlower",10000,(short)100,vegitable_names,50.2f);
Vegitables details=new Vegitables("Onion",10000,(short)150,vegitable_names,25.2f);



}
}