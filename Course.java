public class Course {
    public static void main(String[] args) {
        // Define course cost and GST rate
        double courseCost = 12000.0;
        double gstRate = 18.0; // 18%

        // Calculate GST amount
        double gstAmount = (gstRate / 100) * courseCost;

        // Calculate total fee including GST
        double totalFee = courseCost + gstAmount;

        // Display the total fee
        System.out.println("Course Cost: Rs. " + courseCost);
        System.out.println("GST Rate: " + gstRate + "%");
        System.out.println("GST Amount: Rs. " + gstAmount);
        System.out.println("Total Fee (including GST): Rs. " + totalFee);
    }
}
