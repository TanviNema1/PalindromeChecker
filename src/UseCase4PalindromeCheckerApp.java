/**
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 */
/* 
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 *
 * This reduces extra memory usage.
 *
 * @author Developer
 * @version 4.0
 */

import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    
    /**
     * Method to check palindrome using character array and two-pointer technique
     * 
     * @param str The string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        // Convert the string into a character array
        char[] chars = str.toCharArray();
        
        // Initialize pointer at the beginning
        int start = 0;
        
        // Initialize pointer at the end
        int end = chars.length - 1;
        
        // Assume palindrome initially
        boolean isPalindrome = true;
        
        // Continue comparison until pointers cross
        while (start < end) {
            // Compare characters at start and end positions
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;  // Exit loop if mismatch found
            }
            // Move pointers towards center
            start++;
            end--;
        }
        
        return isPalindrome;
    }
    
    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========================================");
        System.out.println("  PALINDROME CHECKER APP - UC4");
        System.out.println("  Character Array Based Validation");
        System.out.println("  Version: 4.0");
        System.out.println("========================================");
        System.out.println();
        
        // Hardcoded test cases as per requirement
        System.out.println("=== Testing with Hardcoded Values ===");
        String test1 = "radar";
        String test2 = "hello";
        String test3 = "A man a plan a canal Panama";
        String test4 = "racecar";
        
        System.out.println("Input : " + test1);
        System.out.println("Is Palindrome? : " + isPalindrome(test1));
        System.out.println();
        
        System.out.println("Input : " + test2);
        System.out.println("Is Palindrome? : " + isPalindrome(test2));
        System.out.println();
        
        System.out.println("Input : " + test3);
        System.out.println("Is Palindrome? : " + isPalindrome(test3));
        System.out.println();
        
        System.out.println("Input : " + test4);
        System.out.println("Is Palindrome? : " + isPalindrome(test4));
        System.out.println();
        
        // User input option (bonus)
        System.out.println("=== User Input Mode ===");
        System.out.print("Enter a word or sentence to check: ");
        String userInput = scanner.nextLine();
        
        boolean result = isPalindrome(userInput);
        System.out.println("\nInput : " + userInput);
        System.out.println("Is Palindrome? : " + result);
        
        if (result) {
            System.out.println("✅ Explanation: Using two-pointer technique, all matching characters from start and end confirm it's a palindrome.");
        } else {
            System.out.println("❌ Explanation: Using two-pointer technique, mismatch found during character comparison.");
        }
        
        scanner.close();
    }
}