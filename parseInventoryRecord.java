//Product Inventory CSV Parser
import java.util.*;
public class parseInventoryRecord{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String sentence = sc.nextLine();
String[] field = sentence.split(",");
if(field.length!= 3){
System.out.println("Invalid Record");
}
else{
System.out.println("Product: " + field[0] + "| SKU: " + field[1] + "|Qty: "+field[2]);
}
}
}