package conditionals;
import java.util.Scanner;
public class nested3or5butnot15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        // if(n%5 == 0 || n%3 == 0){
        //     if(n%15 != 0){
        //         System.out.println("The entered no. is divisible by 3 or 5 but not by 15");
        //     }
        //     else {
        //         System.out.println("NOt matching the required conditon");
        //     }
        // }
        // else {
        //     System.out.println("Not matching the required conditon");
        // }
        if((n%5 == 0 || n%3 == 0) && n%15 !=0){
            System.out.println("The entered no. is divisible by 3 or 5 but not by 15");
        }
        else {
            System.out.println("Not matching the required condition");
        }
    }

}
