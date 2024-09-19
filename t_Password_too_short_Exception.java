import java.util.Scanner;
// Custom exception for short password
class TooShortException extends Exception {
    public TooShortException() {
        super("Too short!");
    }
}
// Custom exception for missing digit
class NoDigitException extends Exception {
    public NoDigitException() {
        super("No digit!");
    }
}
public class t_Password_too_short_Exception {
    // Function to validate password
    public static void validatePassword(String password) throws TooShortException, NoDigitException {
        // Check if password is too short
        if (password.length() < 6) {
            throw new TooShortException();
        }
        // Check if password contains at least one digit
        boolean hasDigit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            throw new NoDigitException();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input user name (not needed for validation, but as per the problem statement)
        // String username = sc.nextLine();
        // Input password
        String password = sc.nextLine();
        // Try to validate the password
        try {
            validatePassword(password);
            System.out.println("Correct");
        } catch (TooShortException e) {
            System.out.println(e.getMessage());
        } catch (NoDigitException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}