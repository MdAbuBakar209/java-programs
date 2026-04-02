import java.util.Scanner;
public class findremainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int N = sc.nextInt();
        System.out.print("Enter divisor : ");
        int a = sc.nextInt();
        // System.out.println("Enter the qoutient : ");
        int q = N/a;
        // System.out.println("Enter remainder : ");
        int r  = N - a * q;
        System.out.println("The remainder when "+N+" is divided by "+a+" is : "+r);

    

    }

}
