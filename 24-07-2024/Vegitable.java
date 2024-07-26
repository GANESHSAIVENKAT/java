public class Vegitable{
	public String name;
	public int price;
	public char grade;
	public String color;
	public int weight;
	public float calories;
	public String marketname;
	public boolean good;
	public byte rating;
	public String address;
	
	public Vegitable(){
		
	}
	public Vegitable(String name,int price,char grade,String color,int weight,float calories,String marketname,boolean good,byte rating,String address){
		this.name=name;
		this.price=price;
		this.grade=grade;
		this.color=color;
		this.weight=weight;
		this.calories=calories;
		this.marketname=marketname;
		this.good=good;
		this.rating=rating;
		this.address=address;
		System.out.println("Name is :"+name);
		System.out.println("Price is :"+price);
		System.out.println("Grade obtain :"+grade);
		System.out.println("Color of Vegitable"+color);
		System.out.println("Weight of Vegitable"+weight);
		System.out.println("Calories Obtain"+calories);
		System.out.println("Market Name :"+marketname);
		System.out.println("Is Good For Health :"+good);
		System.out.println("Rating given :"+rating);
		System.out.println("Location of Market :"+address);
		
	}
}