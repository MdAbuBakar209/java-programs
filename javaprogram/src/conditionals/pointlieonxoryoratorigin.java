package conditionals;
import java.util.Scanner;
public class pointlieonxoryoratorigin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st value of the co-ordinate(x) : ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd value of the co-ordinate(y) : ");
        int y = sc.nextInt();
        if(x==0 && y==0) {
            System.out.println("The co-ordinate is Origin");
        }
        else if(x==0) {
            System.out.println("point lies on Y-axis");
        }
        else if(y==0) {
            System.out.println("point lies on X-axis");
        }
        else {
            System.out.println("The conditons are not matched --> points neither lie on X-axix or Y-axis nor at origin ");
        }
    }

}
