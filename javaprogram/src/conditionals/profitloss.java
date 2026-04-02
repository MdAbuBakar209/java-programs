package conditionals;
import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price : ");
        int cp = sc.nextInt();
        System.out.println("Enter selling price : ");
        int sp = sc.nextInt();
        if(sp>cp) {
            System.out.print("There is a profit of :Rs ");
            int profit = sp - cp;
            System.out.print(profit);
        }
        if(sp<cp) {
            System.out.print("There is a loss of :Rs ");
            int loss = cp - sp;
            System.out.print(loss);
        }
        // else {
        //     System.out.println("There is no profit or loss");
        //     int nopl = sp = cp;
        //     System.out.println(nopl);
        
        // }


    }

}
