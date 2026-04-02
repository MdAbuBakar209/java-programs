package JavaInput;
import java.util.Scanner;
public class Sumof2numbsInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int y = sc.nextInt();
        int sum = x + y;
        System.out.print("The sum is S"+sum);
        // System.out.println(sum);
    }

}
