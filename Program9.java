import java.util.Scanner;

public class Program9 {
    public static void main(String [] monday){
        int user_age;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the birth year:");
        user_age = Sc.nextInt();

        if(user_age <=60){

            System.out.println("Senior citizen: ");
          }
          else
          {
            System.out.println(" Not senior citizen: ");
          }
    }
    
}
