public class Runner {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	int [] even_numbers={2,4,6,8,10};
	float[] float_values={1.0f,2.0f,3.6f,5.6f};
	char[]consonents={'B','c','D'};
	byte[]shoe_size={4,6,8,10};
	boolean[]head_tail={true,false,true};
    long[]long_number={100L,200L};
	double[]semester_marks={8.24,8.44,8.97,9.00};
	System.out.println("The size of the array is " + cars.length);
    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }
	System.out.println("The size of the array is " + even_numbers.length);
	for (int i = 0; i < even_numbers.length; i++) {
      System.out.println("even numbers are:"+even_numbers[i]);
    }
	System.out.println("The size of the array is " + float_values.length);
	for (int i = 0; i < float_values.length; i++) {
      System.out.println("float Values are"+float_values[i]);
    }
	System.out.println("The size of the array is " + consonents.length);
	for (int i = 0; i < consonents.length; i++) {
      System.out.println("Consonents are"+consonents[i]);
    }
	System.out.println("The size of the array is " + shoe_size.length);
	for (int i = 0; i < shoe_size.length; i++) {
      System.out.println("shoe sizes are"+shoe_size[i]);
    }
	System.out.println("The size of the array is " + head_tail.length);
	for (int i = 0; i < head_tail.length; i++) {
      System.out.println("head_tail are:"+head_tail[i]);
    }
	System.out.println("The size of the array is " + long_number.length);
	for (int i = 0; i < long_number.length; i++) {
      System.out.println("long_numbers are:"+long_number[i]);
    }
	System.out.println("The Size Of Array Is:"+semester_marks.length);
	 for(int i=0;i<semester_marks.length;i++){
		 System.out.println("semester_marks are as follows:"+semester_marks[i]);
	 }
  }
}
