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

public class UseCase9PalindromeCheckerApp {

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
        // Define the input string
        String input = "madam";

        // Remove spaces and convert to lowercase
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Check palindrome using recursion
        boolean isPalindrome = check(cleaned, 0, cleaned.length() - 1);

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
