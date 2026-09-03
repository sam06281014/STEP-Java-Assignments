//Counting Objects With a Static Field
import java.util.*;
class Applicant
{
    static int totalApplicants;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<totalApplicants; i++)
        {
            totalApplicants++;
        }
        totalApplicants = sc.nextInt();
        System.out.print("Total applicants applied: " + totalApplicants);
    }
}