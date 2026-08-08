//ATM PIN Length Validator
	import java.util.Scanner;
	public class checkPinLength{
		public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			System.out.println();
			String pwd = sc.next();
			 if(pwd.length()!=4){
				System.out.println("Invalid PIN — must be exactly 4 digits.");}
			 else{
			System.out.println("PIN length OK.");}
			sc.close();
	}
  }