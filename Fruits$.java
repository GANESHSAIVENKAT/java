public class Fruits$ {
    public static void main(String[] args) {
        // Declare arrays of different types
        String[] friuts = {"Apple", "Banana", "Cherry","Mango","sapota"};
        int[] personlike = {1, 2, 3, 4, 5,6,7};
        long[] calories = {100000L, 200000L, 300000L,46347488L};
       
        
        // Display contents of each array
        System.out.println("String Array:");
        for (int i = 0; i < friuts.length; i++) {
            System.out.println(friuts[i]);
        }

        System.out.println("Int Array:");
        for (int i = 0; i < personlike.length; i++) {
            System.out.println(personlike[i]);
        }

        System.out.println("Long Array:");
        for (int i = 0; i < calories.length; i++) {
            System.out.println(calories[i]);
        }

    
    }
}