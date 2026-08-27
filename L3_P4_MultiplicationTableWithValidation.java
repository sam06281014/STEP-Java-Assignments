// P4. Multiplication Table Generator With Input Validation
public class L3_P4_MultiplicationTableWithValidation {

    static void generateFirstValidTable(int[] candidates) {
        for (int i = 0; i < candidates.length; i++) {
            int candidate = candidates[i];
            if (candidate < 1) {
                System.out.println("Skipping invalid number: " + candidate);
                continue;
            }
            for (int j = 1; j <= 10; j++) {
                System.out.println(candidate + " x " + j + " = " + (candidate * j));
            }
            break;
        }
    }

    public static void main(String[] args) {
        generateFirstValidTable(new int[]{-3, 0, 7, 9});
    }
}
