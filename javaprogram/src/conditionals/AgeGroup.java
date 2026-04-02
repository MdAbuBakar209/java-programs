package conditionals;
import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();

        /*if-else */

        // if(age <= 12) { 
        //     System.out.println("Child");
        // } else if(age >12 && age <18){
        //     System.out.println("Teenager");
        // } else if(age >= 18 && age <= 35) {
        //     System.out.println("Adult");
        // } else {
        //     System.out.println("Old Age");
        // }

        /*nested if-else */
        if(age <=12){
            if(age <=5) {
                System.out.println("Toddler");
            } else {
                System.out.println("Child");
            } 
        }
            // if (age >12 && age <18){
            //     System.out.println("Teenager");
            // } else if(age >=18 && age <=30){
            //     System.out.println("Adult");
            // } else if(age >30) {
            //     System.out.println("Married");
            // } else {
            //     System.out.println("Old Age");
            // }
    }

}
