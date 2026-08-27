// P3. Print Numbers 1 to N
import java.util.Scanner;

public class L1_P3_PrintNumbersUpToN {

    static void printNumbersUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printNumbersUpToN(n);
        sc.close();
    }
}
