package conditionals;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number : ");
        // int n = sc.nextInt();
        // System.out.println(n);
        // if(n%2==0) {
        //     System.out.println("The entered number("+n+") is Even");

        // }
        // // if(n%2 != 0) 
        // else {
        //     System.out.println("The entered number("+n+") is odd");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer : ");
        int n = sc.nextInt();
        if(n<0){
            n = n * (-1);
        }
        System.out.println("The absolute value is : "+n);

        // }
    }

}
