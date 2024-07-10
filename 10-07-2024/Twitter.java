public class Twitter {

    // Static variables
    static int space;
    static String user_name;
    static double viwers;
    static boolean is_a_socialmedia;
    static char grade;
    static long password;
    static long users;
    static float rating;
    static String founder;
    static boolean no_effect_cause;

    // Method to initialize static variables
    public static void Assign() {
        space = 20;
        user_name = "Ramu";
        viwers = 100.14;
        is_a_socialmedia = true;
        grade = 'B';
        password = 1257952648L;
        users = 10000000L;
        rating = 5.5f;
        founder = "JackDorsey";
        no_effect_cause = false;
		result();
    }

    // Method to print static variables
    public static void result() {
        System.out.println("SPace Occupied: " + space);
        System.out.println("ser Detil: " + user_name);
        System.out.println("Total Viewer: " + viwers);
        System.out.println("Twitter is a socialmedia: " + is_a_socialmedia);
        System.out.println("grade given: " + grade);
        System.out.println("Password is: " + password);
        System.out.println("Total users: " + users);
        System.out.println("Total Rating: " + rating);
        System.out.println("Founder of Twitter: " + founder);
        System.out.println("no effect cause: " + no_effect_cause);
    }

    
}
