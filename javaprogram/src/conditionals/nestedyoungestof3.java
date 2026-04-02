package conditionals;
import java.util.Scanner;
public class nestedyoungestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of Ram(a) : ");
        int a = sc.nextInt();
        System.out.println("Enter age of Shyam(b) : ");
        int b = sc.nextInt();
        System.out.println("Enter age of Ajay(c) : ");
        int c = sc.nextInt();
        if(a<b){
            if(a<c){
                System.out.println(a+" is youngest");
            }
            else {
                System.out.println(c+" is youngest");
            }
        }
        else {
            if(b<c){
                System.out.println(b+" is youngest");
            }
            else {
                System.out.println(c+" is largest");
            }
        }
    }

}
