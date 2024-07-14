public class CasioA {

    public static void main(String[] args) {
        // Given numbers
        int[] numbers = {5, 6, 8, 3};

        // Calculate and print the cube of each number
        for (int i = 0; i < numbers.length; i++) {
            int cube = numbers[i] * numbers[i] * numbers[i];
            System.out.println("The cube of " + numbers[i] + " is: " + cube);
        }
    }
}
