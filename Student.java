//Simple Student Record Class
import java.util.*;
public class Student
{
    int marks;
    String name;
public static void main(String[] args)
    {
        Student s = new Student();
        s.marks = 88;
        s.name = "Divya";
        System.out.println("Name: " + s.name + " " +  "Marks: " + s.marks);
    }
}