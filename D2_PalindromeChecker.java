// 2. Palindrome Checker (3 Approaches)
public class D2_PalindromeChecker {

    // Approach 1: Iterative comparison from both ends
    static boolean isPalindromeIterative(String text) {
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

    // Approach 2: Recursive comparison
    static boolean isPalindromeRecursive(String text) {
        return isPalindromeRecursiveHelper(text, 0, text.length() - 1);
    }

    static boolean isPalindromeRecursiveHelper(String text, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (text.charAt(left) != text.charAt(right)) {
            return false;
        }
        return isPalindromeRecursiveHelper(text, left + 1, right - 1);
    }

    // Approach 3: Array reversal
    static boolean isPalindromeArrayReversal(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        return new String(reversed).equals(text);
    }

    static void checkAllApproaches(String text) {
        String iterativeResult = isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome";
        String recursiveResult = isPalindromeRecursive(text) ? "Palindrome" : "Not Palindrome";
        String arrayResult = isPalindromeArrayReversal(text) ? "Palindrome" : "Not Palindrome";

        System.out.println("Iterative: " + iterativeResult
                + " | Recursive: " + recursiveResult
                + " | Array Reversal: " + arrayResult);
    }

    public static void main(String[] args) {
        checkAllApproaches("madam");
        checkAllApproaches("hello");
    }
}
