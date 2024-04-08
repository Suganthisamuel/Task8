

public class Program1 {

 public static void main(String[] args) {
    int int_a = 15;
    int int_b = 11;
    int int_c = 16;
    int int_d = 13;

    boolean bool_flag = false;

    if((int_a + int_b) > (int_c + int_d)){

        bool_flag = true;

    }

    System.out.println("The sum of a and b is greaterthan of c and d is"+ bool_flag );

    boolean bool_flag2 = false;

    if((int_c + int_d) > (int_a + int_b)){

        bool_flag2 = true;
    }

    System.out.println("The sum of c and d is greaterthan of a and b is"+ bool_flag2);
    
 }

    
}
