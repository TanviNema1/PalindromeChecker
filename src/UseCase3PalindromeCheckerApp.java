/**
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 */
/* Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */

import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

    /**
     * Method to check palindrome by reversing string
     *
     * @param str The string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for accurate comparison
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Build reversed string using loop
        String reversed = "";

        // Loop through original string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);  // String concatenation
        }

        // Compare original and reversed strings
        return str.equals(reversed);
    }

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App - UC3 ===");
        System.out.println("Checking palindrome using string reverse method");
        System.out.println("Version: 3.0");
        System.out.println();

        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        // Check if input is palindrome
        if (isPalindrome(input)) {
            System.out.println("\n✅ RESULT: '" + input + "' IS a palindrome!");
            System.out.println("Explanation: When reversed, it reads the same.");
        } else {
            System.out.println("\n❌ RESULT: '" + input + "' is NOT a palindrome.");
            System.out.println("Explanation: When reversed, it reads differently.");
        }

        scanner.close();
    }
}
