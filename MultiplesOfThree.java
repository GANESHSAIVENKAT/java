public class MultiplesOfThree {

    public static void main(String[] args) {
        int limit = 30; // Specify the limit for multiples of 3
        
        System.out.println("Multiples Of 3 Are As Follows:");
        for (int i = 1; i <= limit / 3; i++) {
            int multiple = i * 3;
            System.out.println(""+multiple);
        }
		
    }  
}
