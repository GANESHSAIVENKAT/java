public class Bottle{
	public String name;
	public int price;
	public int rating;
	public String color;
	public float length;
	public boolean hold;
	public long made;
	public double weight;
	public boolean using;
	public char grade;
	
	public Bottle(){
		
		System.out.println("Default Constructor");
	}
	public Bottle(String name,int price,int rating,String color,float length,boolean hold,long made,double weight,boolean using,char grade){
		this.name=name;
		this.price=price;
		this.rating=rating;
		this.color=color;
		this.length=length;
		this.hold=hold;
		this.made=made;
		this.weight=weight;
		this.using=using;
		this.grade=grade;
		System.out.println("Company name :"+name);
		System.out.println("Bottle Price :"+price);
		System.out.println("Rating :"+rating);
		System.out.println("Color of Bottle Purchased :"+color);
		System.out.println("Length of Bottle :"+length);
		System.out.println("Bottle having Good Grip :"+hold);
		System.out.println("Production of Bottle per year :"+made);
		System.out.println("Weight of Bottle :"+weight);
		System.out.println("I like to use that Bottle :"+using);
		System.out.println("Grade given to Bottle is :"+grade);
		
		                                                                                                       
		
	}
	public void detail(){
        if(name==name){
			System.out.println("Requirities is Correct");
		}else{
			System.out.println("Requirities is Wrong");
		}
    }
	
	
    
    public int detail(int price){
		
        if(price<=100){
			System.out.println("Ok We can buy"+price);
		}else{
			System.out.println("Not Required");
		}return 1;
    }

	public void detail(boolean hold){
        if(hold==true){
			System.out.println("Grip is Good");
		}else{
			System.out.println("No Grip");
		}
    }
	 public char calculation(){
		int price=100;
        if(price<=90){
			System.out.println("Ok We can");
		}else{
			System.out.println("Not Required");
		}return 'A';
    }
	
	
	
}