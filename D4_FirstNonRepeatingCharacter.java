// 4. First Non-Repeating Character
import java.util.HashMap;
import java.util.Map;

public class D4_FirstNonRepeatingCharacter {

    static char findFirstNonRepeatingChar(String text) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency.get(ch) == 1) {
                return ch;
            }
        }

        // Sentinel value indicating no non-repeating character was found
        return '\0';
    }

    static void printFirstNonRepeatingChar(String text) {
        char result = findFirstNonRepeatingChar(text);

        if (result == '\0') {
            System.out.println("No Non-Repeating Character Found");
        } else {
            System.out.println("First Non-Repeating Character: '" + result + "'");
        }
    }

    public static void main(String[] args) {
        printFirstNonRepeatingChar("swiss");
        printFirstNonRepeatingChar("aabbcc");
    }
}
