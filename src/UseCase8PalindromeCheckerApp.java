/**
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a singly linked list.
 * It demonstrates the use of linked list data structure and
 * pointer manipulation techniques.
 *
 * At this stage, the application:
 * - Converts string to linked list
 * - Uses fast and slow pointers to find middle
 * - Reverses second half of the list
 * - Compares first and second halves
 * - Displays the result
 *
 * This introduces dynamic data structures and in-place operations.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.*;

public class UseCase8PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string
        String input = "level";

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            // Remove and compare first and last elements
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}