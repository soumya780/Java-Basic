import java.util.*;
public class loop {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int c =0;
        System.out.println("Enter hoe many time you want to print:");
        int t = s.nextInt();
        System.out.println("What you want to prrint:");
        //char text=s.next().c;

        while(c<t)
        {
        System.out.println("hello");
        c++;

        }
        System.out.println("Printed hw "+t+"times");
        int counter=1;
        while(counter<=10)
        {
            System.out.println(counter);
            counter++;

        }

        /// print 1 to n
        System.out.println("enter the value of n:");
        int n = s.nextInt();
        int counter2 = 1;
        while (counter2<=n)
        {
            System.out.println(counter2);
            counter2++;

        }

    }


}
