package JavaInput;
import java.util.Scanner;
public class CircleAreawithInput {
    public static void main(String[] args) {
         @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        //  int r = 12;
        System.out.print("Enter radius : ");
        int r;
        r = sc.nextInt();
         double pi = 3.1415;
         double A = pi * r *r;
         System.out.println("The area of Circle is : "+A);
    }

}
