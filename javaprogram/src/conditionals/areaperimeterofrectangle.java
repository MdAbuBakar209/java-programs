package conditionals;
import java.util.Scanner;
public class areaperimeterofrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length of rectangle(l): ");
        int l = sc.nextInt();
    
        System.out.print("Enter breadth of rectangle(b): ");
        int b = sc.nextInt();
        int A = l * b;
        System.out.println("The area of rectangle is : "+A);
        System.out.println("\n");
        int P = 2*(l+b);
        System.out.println("The perimeter of rectangle is : "+P);
        System.out.println("\n");
        if(A>P) {
            System.out.println("Area is greater than perimeter of rectangle");
        }
        else if(P>A){
            System.out.println("Perimeter is greater than Area");
        }
        else {
            System.out.println("Area and Perimeter are same");
        }
    }

}
