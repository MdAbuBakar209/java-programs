package conditionals;
import java.util.Scanner;
public class nested3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer : ");
        int n = sc.nextInt();
        if(n%5 ==0 ){
            if(n%3 == 0){
            System.out.println("The entered no. is divisible by 5 and 3 both");
            }
            else{
                System.out.println("NOt divisible");
            }
        }
        else {
            System.out.println("Not divisible");
        }
    }
    

}
