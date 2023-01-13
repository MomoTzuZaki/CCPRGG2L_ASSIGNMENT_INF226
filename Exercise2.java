import java.util.Scanner;

public class Drivingtest {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        driving("driver");
        scan.close();
    }

    static void driving(String driver) {

        System.out.println("driving!");
        taste(driver);

        String feedback = getFeedBack(driver);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            fixRecipe(driver);

            // Recursive call
            driving(driver);
        } else if (feedback.equals("yes")) {
            serve(driver);
        }
    }

    static void taste(String driver) {
        System.out.println("test driving");
    }

    static String getFeedBack(String driver) {
        System.out.println("Is the " + driver + " good? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixRecipe(String driver) {
        System.out.print("Enter additional driving skill:");
        String drivingskill = scan.next();
        System.out.println("Fixing skill. Added " + drivingskill);
    }

    static void serve(String driving) {
        System.out.println(driving + " passed");
    }

}