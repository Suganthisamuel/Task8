import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = sc.nextInt();

        if(number %2 ==0){
            System.out.println("The number is even: ");
        }
        else{
            System.out.println("The number is not even:");
        }


    }
    
}
