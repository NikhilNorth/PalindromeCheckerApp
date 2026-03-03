public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String word = "racecar";

        if (word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}