package conditionals;
import java.util.Scanner;
public class squareornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length(l): ");
        int l = sc.nextInt();
        System.out.println("Enter breadth(b) : ");
        int b = sc.nextInt();
        if(l==b){
            System.out.println("This a square");
        }
        else {
            System.out.println("This is not a square");
        }
    }

}
