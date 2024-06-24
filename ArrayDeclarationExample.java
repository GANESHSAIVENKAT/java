public class ArrayDeclarationExample {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	int [] even_numbers={2,4,6,8,10};
	float[] float_values={1.0f,2.0f,3.6f,5.6f};
	char[]consonents={'B','c','D'};
	byte[]shoe_size={4,6,8,10};
	boolean[]head_tail={true,false,true};
    long[]long_number={100L,200L};
    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }
	for (int i = 0; i < even_numbers.length; i++) {
      System.out.println("even numbers are:"+even_numbers[i]);
    }
	for (int i = 0; i < float_values.length; i++) {
      System.out.println("float Values are"+float_values[i]);
    }
	for (int i = 0; i < consonents.length; i++) {
      System.out.println("Consonents are"+consonents[i]);
    }
	for (int i = 0; i < shoe_size.length; i++) {
      System.out.println("shoe sizes are"+shoe_size[i]);
    }
	for (int i = 0; i < head_tail.length; i++) {
      System.out.println("head_tail are:"+head_tail[i]);
    }
	for (int i = 0; i < long_number.length; i++) {
      System.out.println("long_numbers are:"+long_number[i]);
    }
	
  }
}
