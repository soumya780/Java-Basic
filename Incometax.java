import java.util.*;
public class Incometax {
    public static void main(String args [])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your salary :");
        float sal = s.nextFloat();
        if (sal < 500000)
        {
           System.out.println(" the tax is 0% ");
           System.out.println(" your sal final salry after tax deduction :"+sal);

        }
        else if (sal >=500000 && sal <1000000)
        {
            System.out.println("You have to pay 20 % tax to gov .");
            float tax = sal*0.20f;
            float last = sal - tax;
            System.out.println("The Amount of Tax You have to pay every year is :"+tax);
            System.out.println("The sal after tax deduction is "+last);
        }
        else if ( sal > 1000000 )
        {
            System.out.println("You have to pay 30 % tax to gov .");
            float tax = sal*0.30f;
            float last = sal - tax;
            System.out.println("The Amount of Tax You have to pay every year is :"+tax);
            System.out.println("The sal after tax deduction is "+last);
        }
        else
        {
            System.out.println("no tax");
        }

    }

}
