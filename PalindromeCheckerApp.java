import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : text.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                deque.addLast(Character.toLowerCase(ch));
            }
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        if (isPalindrome(input)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}