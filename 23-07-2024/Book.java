public class Book{
	public String bookname;
	public String authorname;
	public int price;
	
	public Book(){
		System.out.println("Default constructor");
	}
	public Book(String bookname,String authorname){
		this.bookname=bookname;
		this.authorname=authorname;
		System.out.println("Book Name :"+bookname);
		System.out.println("Authorname :"+authorname);
		
		
	}
	public Book(String bookname,String authorname,int price){
		this.bookname=bookname;
		this.authorname=authorname;
		this.price=price;
		System.out.println("Book Name :"+bookname);
		System.out.println("Authorname :"+authorname);
		System.out.println("Price Of book :"+price);
		
		
	}
	
}