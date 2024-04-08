import java.util.Scanner;

public class Program7 {





   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      String str = scan.nextLine();
      
      int len = str.length();
      System.out.println("\nLength of String = " +len);
   }
}
