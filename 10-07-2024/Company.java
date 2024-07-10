public class Company {

    // Static variables
    static String companyName;
    static int yearFounded;
    static double revenue;
    static boolean isPublicCompany;
    static String headquartersLocation;

    public static void main(String[] args) {
        // Assign values using references (objects)
        companyName = "Tech Solutions Inc.";
        yearFounded = 2005;
        revenue = 5000000.0;
        isPublicCompany = true;
        headquartersLocation = "New York";

        // Print out the values of the static variables
        System.out.println("Company Name: " + companyName);
        System.out.println("Year Founded: " + yearFounded);
        System.out.println("Revenue: $" + revenue);
        System.out.println("Public Company: " + isPublicCompany);
        System.out.println("Headquarters: " + headquartersLocation);
    }
}
