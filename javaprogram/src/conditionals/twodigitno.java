package conditionals;
import java.util.Scanner;
public class twodigitno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit(n) : ");
        int n = sc.nextInt();
        if(n>9 && n<100) {
            System.out.println("The entered digit is a 2 digit no.");
        }
        else {
            System.out.println("The entered digit is not a 2 digit no.");
        }
    }

}
