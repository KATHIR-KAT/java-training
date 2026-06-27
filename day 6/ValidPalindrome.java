import java.util.*;

public class ValidPalindrome {

    static boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {

                if (isPalindrome(str, left + 1, right) ||
                    isPalindrome(str, left, right - 1)) {
                    System.out.println("Palindrome after removing one character");
                } else {
                    System.out.println("Not a palindrome");
                }
                return;
            }
        }

        System.out.println("Palindrome");
    }
}