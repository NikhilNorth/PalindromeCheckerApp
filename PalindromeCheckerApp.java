interface PalindromeStrategy {
    boolean isPalindrome(String text);
}

class ReversePalindromeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }
}

class LoopPalindromeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String text) {
        return strategy.isPalindrome(text);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeContext context = new PalindromeContext();

        String word = "madam";

        context.setStrategy(new ReversePalindromeStrategy());
        System.out.println(context.checkPalindrome(word));

        context.setStrategy(new LoopPalindromeStrategy());
        System.out.println(context.checkPalindrome(word));
    }
}
