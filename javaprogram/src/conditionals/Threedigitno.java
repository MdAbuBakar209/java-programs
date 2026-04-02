package conditionals;
import java.util.Scanner;
public class Threedigitno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit(n) : ");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println(""+n+" is a 3 digit no.");

        }
        else {
            System.out.println(""+n+" is Not a 3 digit no.");
        }
    }

}
