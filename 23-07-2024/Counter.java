public class Counter{

	static int count=8;

	public Counter(){
		this.count++;
		System.out.println(this.count++);
	}
}