/**
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using Deque (Double Ended Queue)
 * which allows insertion and deletion from both ends.
 *
 * At this stage, the application:
 * - Inserts characters into a deque
 * - Removes and compares first and last characters
 * - Continues until deque is empty or mismatch found
 * - Displays the result
 *
 * This approach is optimized as it eliminates the need for
 * separate reversal data structures.
 *
 * @author Developer
 * @version 7.0
 */

import java.util.*;

public class UseCase7PalindromeCheckerApp {

    /**
     * Method to check palindrome using Deque (Double Ended Queue)
     *
     * @param str The string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : str.toCharArray()) {
            deque.addLast(c);  // Add to the end of deque
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            // Remove and compare first and last characters
            char first = deque.removeFirst();  // Remove from front
            char last = deque.removeLast();    // Remove from back

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }

    /**
     * Method with detailed output to show the comparison process
     */
    public static boolean isPalindromeWithTrace(String str) {
        // Clean the string
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Create a Deque
        Deque<Character> deque = new ArrayDeque<>();

        System.out.println("\n=== Deque Operations ===");
        System.out.println("Original string: " + str);
        System.out.println("Cleaned string: " + cleaned);
        System.out.println();

        // Add characters to deque
        System.out.println("1. Adding characters to Deque:");
        for (char c : cleaned.toCharArray()) {
            deque.addLast(c);
            System.out.println("   Added: '" + c + "' → Deque: " + deque);
        }

        System.out.println("\n2. Removing and comparing first and last characters:");

        boolean isPalindrome = true;
        int step = 1;

        // Create a copy for tracing
        Deque<Character> tempDeque = new ArrayDeque<>(deque);

        while (tempDeque.size() > 1) {
            char first = tempDeque.removeFirst();
            char last = tempDeque.removeLast();

            System.out.println("   Step " + step + ": First = '" + first +
                    "' | Last = '" + last + "' → " +
                    (first == last ? "✓ MATCH" : "✗ MISMATCH"));

            if (first != last) {
                isPalindrome = false;
                break;
            }
            step++;
        }

        if (tempDeque.size() == 1 && isPalindrome) {
            System.out.println("   Step " + step + ": Single character '" +
                    tempDeque.removeFirst() + "' remains (middle character)");
        }

        return isPalindrome;
    }

    /**
     * Alternative implementation using pollFirst() and pollLast()
     */
    public static boolean isPalindromeAlternative(String str) {
        // Clean the string
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Create Deque and add all characters
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.offerLast(c);  // Same as addLast
        }

        // Compare front and back until deque is empty or has 1 element
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                return false;
            }
        }

        return true;
    }

    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("  PALINDROME CHECKER APP - UC7");
        System.out.println("  Deque-Based Optimized Palindrome Checker");
        System.out.println("  Version: 7.0");
        System.out.println("========================================");
        System.out.println();
        System.out.println("Concept: Using Deque (Double Ended Queue)");
        System.out.println("Remove and compare from both ends simultaneously");
        System.out.println();

        // Hardcoded test cases as per requirement
        System.out.println("=== Testing with Hardcoded Values ===");

        // Test case 1: "refer"
        String test1 = "refer";
        System.out.println("Input : " + test1);
        System.out.println("Is Palindrome? : " + isPalindrome(test1));
        isPalindromeWithTrace(test1);
        System.out.println();

        // Test case 2: "racecar"
        String test2 = "racecar";
        System.out.println("Input : " + test2);
        System.out.println("Is Palindrome? : " + isPalindrome(test2));
        System.out.println();

        // Test case 3: "hello"
        String test3 = "hello";
        System.out.println("Input : " + test3);
        System.out.println("Is Palindrome? : " + isPalindrome(test3));
        System.out.println();

        // Test case 4: "madam"
        String test4 = "madam";
        System.out.println("Input : " + test4);
        System.out.println("Is Palindrome? : " + isPalindrome(test4));
        System.out.println();

        // Test case 5: With spaces and case
        String test5 = "A man a plan a canal Panama";
        System.out.println("Input : " + test5);
        System.out.println("Is Palindrome? : " + isPalindrome(test5));
        System.out.println();

        // Test case 6: Numeric palindrome
        String test6 = "12321";
        System.out.println("Input : " + test6);
        System.out.println("Is Palindrome? : " + isPalindrome(test6));
        System.out.println();

        // User input option
        System.out.println("=== User Input Mode ===");
        System.out.print("Enter a word or sentence to check: ");
        String userInput = scanner.nextLine();

        boolean result = isPalindrome(userInput);
        System.out.println("\nInput : " + userInput);
        System.out.println("Is Palindrome? : " + result);

        if (result) {
            System.out.println("✅ Deque Logic: Removed and compared from both ends, all characters matched.");
        } else {
            System.out.println("❌ Deque Logic: Found mismatch when comparing front and rear characters.");
        }

        scanner.close();
    }
}