package basics;
import java.util.*;
public class prime {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n==2)
        {
            System.out.println("2 is a prime number");
        }
        else
        {
            boolean isPrime = true;
            for(int i =2; i<= Math.sqrt(n); i++)
            {
                if (n % i == 0) // n is a multiple of i ( i not equal to 1or n)
                {
                    isPrime = false;
                }
            }
                if (isPrime == true)
                {
                    System.out.println(+n + " is a prime number");
                }
                else
                {
                    System.out.println(+n + " is not a prime number.");
                }



        }
    }

}
