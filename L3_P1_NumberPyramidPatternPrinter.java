// P1. Number Pyramid Pattern Printer
import java.util.Scanner;

public class L3_P1_NumberPyramidPatternPrinter {

    static void printNumberPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        printNumberPyramid(n);
        sc.close();
    }
}
