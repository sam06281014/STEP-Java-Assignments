// P1. Voting Eligibility Checker
import java.util.Scanner;

public class L1_P1_VotingEligibilityChecker {

    static void checkVotingEligibility(int age) {
        boolean isEligible = age >= 18;
        if (isEligible) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        checkVotingEligibility(age);
        sc.close();
    }
}
