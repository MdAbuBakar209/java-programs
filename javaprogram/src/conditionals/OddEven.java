package conditionals;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // if(num % 2 == 0){
        //     System.out.println("Number is Even");
        // } else {
        //     System.out.println("Number is Odd");
        // }

        /* Ternary operator */

        String ans;
        ans =(num % 2 ==0) ? "Even" : "Odd";
        System.out.println(ans);
    }
}
