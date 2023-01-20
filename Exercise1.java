import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Pattern pattern = null;
        Matcher match = null;
        boolean isValid = false;

        // ============================================================
        System.out.println("1. National University Email Address");

        // Rules
        // - It should always begin with www.
        // - It should always end with .com
        String website = scan.nextLine();

        // Provide regex pattern
        pattern = Pattern.compile("^(www.)[\\w\\d]+(.com)$");

        match = pattern.matcher(website);

        isValid = match.matches();

        if (isValid) {
            System.out.println("Valid!");
        } else {
            System.out.println("Invalid!");
        }

        // ============================================================
        System.out.println("2. 24 hour time (HH:MM:SS) Validation");

        // Rules
        // The pattern should match 00:00:00 up to 23:59:59

        String time = scan.nextLine();

        // Provide regex pattern
        pattern = Pattern.compile("^([0-1]\\d|2[0-3]):([0-5][0-9]):([0-5][0-9])$");

        match = pattern.matcher(time);

        isValid = match.matches();

        if (isValid) {
            System.out.println("Text is Valid!");
        } else {
            System.out.println("Text is Invalid!");
        }

        // ============================================================
        System.out.println("3. Finding specific files.");
        // 3. Finding specific files.

        // Rules
        // The pattern should match files with the following file extension names
        // .jpg
        // .png
        // .xlsx
        // .txt

        String myfiles = "myproject.txt, assignment.xlsx, invalid file, picture.jpg, number.png";

        // Provide regex pattern
        pattern = Pattern.compile("\\w+\\.(jpg|png|xlsx|txt)");
        match = pattern.matcher(myfiles);

        boolean found = false;

        while (match.find()) {
            System.out.println("I found the text " + match.group());
            found = true;
        }
        if (!found) {
            System.out.println("No files found.");
        }

        // ============================================================
        System.out.println("4. Password Validation");

        // Rules
        // - The password should be at least 10 characters in length.
        // - The password should contain at least one special character.
        // - Any characters are allowed except the letters E,L,I,Z,R

        // Example: ponio$12345

        String password = scan.nextLine();

        // Provide the pattern
        pattern = Pattern.compile("^(?=.*[@$_!^%*#?&~()+=-])((?!.*E|L|I|Z|R).){10,}$");

        match = pattern.matcher(password);

        isValid = match.matches();

        if (isValid) {
            System.out.println("Password is valid! ");
        } else {
            System.out.println("Password is invalid! ");
        }

        // ============================================================
        System.out.println("5. Revealing numbers");
        String phonenumbers = "+63956678392, +63917123561234, +639190011223, +63915456213461";

        // Rules
        // Make all phone numbers uniform by making them all start with +63

        // Provide the regex pattern
        phonenumbers = phonenumbers.replaceAll("09(?=\\d{11})", "+639");

        System.out.println(phonenumbers);

        scan.close();
    }
}
