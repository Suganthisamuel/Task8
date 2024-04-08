import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {
        int a,b,z;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        a = Sc.nextInt();
        b = Sc.nextInt();

        System.out.println("Before swaping the values:" + a +" " + b);
        z = a;
        a = b;
        b = z;

        System.out.println("After swaping the values:" + a + " " + b);
    }

    
}
