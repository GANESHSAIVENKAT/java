public class BottleRunner{
	public static void main (String... args){
	Bottle info=new Bottle();
	Bottle info1=new Bottle("Eagle",90,5,"Blue",10.5f,true,100000000L,1.5,true,'A');
	info.detail();
	info.detail(90);
	info.detail(true);
	info.calculation();
	
	}
	
}