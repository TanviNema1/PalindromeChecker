import java.util.Scanner;

public class PalindromeChecker {

    // Method to check palindrome
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", ""); // remove spaces & symbols

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("✅ It is a palindrome!");
        } else {
            System.out.println("❌ Not a palindrome.");
        }

        scanner.close();
    }
}
