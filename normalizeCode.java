//Library ISBN Normalizer & Validator
import java.util.Scanner;
public class normalizeCode{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String raw = sc.nextLine();
        String code = raw.trim();
        code = code.substring(0, 3).toUpperCase() + code.substring(3);
        if (code.length() != 13) {
            System.out.println("Invalid: code must be exactly 13 characters");
        } else {
            boolean letters = true;
            for (int i = 0; i < 3; i++) {
                if (!Character.isLetter(code.charAt(i))) {
                    letters = false;
                    break;
                }
            }
            if (!letters) {
                System.out.println("Invalid: publisher code must be 3 letters");
            } else {
                boolean digits = true;
                for (int i = 3; i < 13; i++) {
                    if (!Character.isDigit(code.charAt(i))) {
                        digits = false;
                        break;
                    }
                }
                if (!digits) {
                    System.out.println("Invalid: year/catalog must be digits");
                } else {
                    StringBuilder result = new StringBuilder();
                    result.append("[");
                    result.append(code.substring(0, 3));
                    result.append("] YEAR: ");
                    result.append(code.substring(3, 7));
                    result.append(" | CATALOG: ");
                    result.append(code.substring(7));
                    System.out.println(result);
                }
            }
        }
        sc.close();
    }
}