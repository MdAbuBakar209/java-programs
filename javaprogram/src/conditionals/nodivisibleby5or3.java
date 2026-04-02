package conditionals;
import java.util.Scanner;
public class nodivisibleby5or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive digit(n) : ");
        int n = sc.nextInt();
        if(n%3 == 0 || n%5 == 0){
            System.out.println("The entered no is divisible by 3 or 5");
        }
        else {
            System.out.println("The entered no is not divisible by 3 or 5");
        }
    }
}
