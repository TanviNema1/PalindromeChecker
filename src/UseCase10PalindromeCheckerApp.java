/**
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Developer
 * @version 9.0
 */

import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base case: if start index >= end index, all characters matched
        if (start >= end) {
            return true;
        }

        // Check if characters at start and end positions match
        if (s.charAt(start) != s.charAt(end)) {
            return false;  // Mismatch found
        }

        // Recursive call: move inward by incrementing start and decrementing end
        return check(s, start + 1, end - 1);
    }

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("  RECURSIVE PALINDROME CHECKER");
        System.out.println("  Version: 9.0");
        System.out.println("========================================");
        System.out.println();

        // Test with hardcoded value as per requirement
        String input = "madam";
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        boolean result = check(cleaned, 0, cleaned.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);

        // Allow user to test more strings
        System.out.println("\n=== Test More Strings ===");
        System.out.print("Enter a word or sentence (or press Enter to exit): ");
        String userInput = scanner.nextLine();

        if (!userInput.isEmpty()) {
            cleaned = userInput.toLowerCase().replaceAll("[^a-z0-9]", "");
            result = check(cleaned, 0, cleaned.length() - 1);
            System.out.println("\nInput : " + userInput);
            System.out.println("Is Palindrome? : " + result);
        }

        scanner.close();
    }
}