import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistrationDay13 {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Day13");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Name(Start with capital letter and has minimum 3 character): ");
        String firstname = sc.nextLine();

        boolean result = new UserRegistrationDay13().validateFIRSTNAME(firstname);
        System.out.println(result);
    }

    public boolean validateFIRSTNAME(String firstname) {
        return Pattern.compile("[A-Z][a-z]{2,}").matcher(firstname).matches();
    }
}
