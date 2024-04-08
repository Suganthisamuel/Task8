import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        
        int number;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = Sc.nextInt();
        String str = String.valueOf(number);
        System.out.println("Number of digits: " +str.length() );

    }
    
}
