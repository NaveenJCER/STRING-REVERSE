import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        final String VALID_USERNAME = "admin";
        final String VALID_PASSWORD = "pas123";
        Scanner scanner = new Scanner(System.in);
        // Step 1: Login Form
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        // Step 2: Validate Credentials
        if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
            // Step 3: Show Reversal UI
            System.out.println("Login successful!!!");
            // Step 4: User Enters String
            System.out.print("Enter a string to reverse: ");
            String input = scanner.nextLine();
            // Step 5: Reverse String
            String reversed = " ";
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += input.charAt(i);
            }
            // Step 6: Show Result
            System.out.println("Reversed String: " + reversed);
        } 
        else 
        {
            // Step 7: Show Error Message
            System.out.println("Invalid username or password");
        }
        // End
        scanner.close();
    }
}
