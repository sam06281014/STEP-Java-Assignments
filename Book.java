//Simple Book Record Class
import java.util.*;
class Book
{
    String title;
    double price;
    public static void main(String[] args)
    {
        Book b = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.print("Title : ");
        b.title = sc.nextLine();
        System.out.print("Price: ");
        b.price = sc.nextDouble();
        System.out.println("Title : " + b.title + " | " + "Price : " + b.price);
    }
}