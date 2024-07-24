public class Books{
	public String bookname;
	public String authorname;
	public int price;
	
	public Books(){
		this("Naruto","Kishimoto");
		System.out.println("Default constructor");
	}
	public Books(String bookname,String authorname){
		this("Naruto","Kishimoto",90);
		this.bookname=bookname;
		this.authorname=authorname;
		System.out.println("Book Name :"+bookname);
		System.out.println("Authorname :"+authorname);
		
		
	}
	public Books(String bookname,String authorname,int price){
		
		this.bookname=bookname;
		this.authorname=authorname;
		this.price=price;
		System.out.println("Book Name :"+bookname);
		System.out.println("Authorname :"+authorname);
		System.out.println("Price Of book :"+price);
		
		
	}
	
}