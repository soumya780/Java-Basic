package basics;
import java.util.*;
public class conditional {
    public static void main(String args[]) {
        System.out.println("Enter the age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 13 && age <= 18) {
            System.out.println("Teen Ager.");
        }
        if (age <= 12 || age <= 1) {
            System.out.println("Child");
        } else {
            System.out.println(" Adult");
        }
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("A is larger ");
            System.out.println("A is same as B");
        } else {
            System.out.println("B is larger ");
        }
        // Even Odd problem
        int n = 10;
        if (n % 2 == 0) {
            System.out.println("N is an even number");
        }
        else
        {
            System.out.println("N is an odd number");
        }





        /// else if statement

        int umar = 20;
         if (umar >=18)
         {
             System.out.println("Adult");

         } else if (age >=13 && age <18) {
             System.out.println("Teen ager");

         }else
         {
         System.out.println("child")  ;
         }

    }
}