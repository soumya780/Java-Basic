package basics;
import java.util.*;

public class operator
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
     //   int a = 10;
       // int b = 20;
        //System.out.println("Sum is :"+a+b);
      //  System.out.println("Sum is :"+a*b);
     //   System.out.println("Sum is :"+ a/b);
      //  System.out.println("Sum is :"+a%b);
       int a= 10;
       int b = ++a;
       b*=5;

       System.out.println(b);
       System.out.println(a);
       System.out.println("------------------------");
       // Relational Operators.
       int c =12;
        int d = 13;

        d -= 5;
        // alternative of a= a+10; Much faster.
       //c +=10;
        c*=5; // c= c*5;
        c /=2;   // c= c/2;


        System.out.println(c);
        System.out.println(d);
        // logical AND Operator.
        System.out.println( !( 3>2) );
        // Logical Or ||
        // If one statement true then ans is always true.
        System.out.println((3<2) || (232>77));
        System.out.println((3<2) || (232>77));
        // Ternary Operator
        System.out.println("___________________");
        int number = 5;
        String type =((number%2) == 0)? "even" : "odd";
        System.out.println(type);


    }
}
