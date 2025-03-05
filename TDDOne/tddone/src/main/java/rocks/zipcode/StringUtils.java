package rocks.zipcode;
/** 
 * EXERCISE 1: StringUtils
 * 
 * Implement the StringUtils class to make all tests pass.
 * The class should have methods to:
 * - reverse a string
 * - count occurrences of a character in a string
 * - check if a string is a palindrome (ignoring case and non-alphanumeric characters)
 */

 // Student must implement this class
public class StringUtils {
    // TODO: Implement the following methods to make the tests pass
    
    public static String reverse(String str) {
        // Your implementation here
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
        //return null;
    }
    
    public static int countOccurrences(String str, char c) {
        // Your implementation here
        int occurrences = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == c) {
                occurrences++;
            }
        }
        return occurrences;
        //return 0;
    }
    
    public static boolean isPalindrome(String str) {
        // Your implementation here
        // Note: Ignoring case and non-alphanumeric characters
        return false;
    }
}

