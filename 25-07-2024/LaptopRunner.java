public class LaptopRunner{
public static void main(String[] args){
Laptop laptop = new Laptop();
int length = laptop.getlength();
		System.out.println("length is:"+length);
		laptop.createbyLaptopname("Dell");
		laptop.createbyLaptopname("HP");
		laptop.createbyLaptopname("Asus");
		laptop.createbyLaptopname("Acer");
		laptop.createbyLaptopname("Apple");
		laptop.laptopreadby();
		System.out.println("----------update--------");
		laptop.laptopupdateby("Dell","Lenovo");
		laptop.laptopreadby();
		System.out.println("----------delete--------");
		laptop.laptopdeleteby("Acer");
		laptop.laptopreadby();
		System.out.println("----------search--------");
		String laptops = laptop.searchByLaptopNames("Samsung");
		System.out.println(laptops);
		laptop.laptopreadby();
 }
}
