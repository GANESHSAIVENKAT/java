public class SumOfArray {
    public static void main(String[] args) {
        // Define an num of numbers
        int []num = {1, 2, 3, 4, 5};

        // Initialize a variable to store the sum
        int sum = 0;
		

        // Iterate through each element in the array and add it to sumArray
        for (int i=0;i<num.length;i++ ) {
            sum = sum+num[i];
        }

        // Print the sum
        System.out.println("Sum of array elements: " + sum);
    }
}
