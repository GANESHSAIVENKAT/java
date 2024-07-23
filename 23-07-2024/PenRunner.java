public class PenRunner{
	public static void main (String... args){
	Pen info=new Pen();
	Pen info1=new Pen("Bitco",30,5,"Blue",6.5f,true,100000000L,2.5,true,'A');
	info.detail();
	info.detail(20);
	info.detail(true);
	info.calculation();
	
	}
	
}