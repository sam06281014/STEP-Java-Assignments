//Basic Constructor for a Course
import java.util.*;
class Course
{
    String code, title;
    public static void main(String[] args)
    {
        Course course = new Course();
        Scanner sc = new Scanner(System.in);
        System.out.print("code =  ");
        course.code = sc.nextLine();
        System.out.print("title = ");
        course.title = sc.nextLine();
        System.out.println(course.code + " - " + course.title);
    }
}