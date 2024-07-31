package basics;
import java.util.*;
public class Typecast
{
    public static void main(String args[])
    {
        // Type Casting In java.
        Scanner sc= new Scanner (System.in);
        float mark =99.999f;
        int marks2=(int) mark;
        char ch ='B';
        int number =ch;
        // It will print the ascii number of the char .
        System.out.println(number);
        System.out.println(marks2);
        System.out.println("_______________________");
        char a = 'a';
        char b = 'b';
        short s=3;
        byte c ='c';
        byte bt =(byte) (a+b+c);
        System.out.println();
        System.out.println(a-b);
        System.out.println((int)(b));
        System.out.println((int)(a));
        int n = 10;
        float x= 20.4f;
        long y = 25;
        double d = 30;
        double ans= n+x+y+d;
        System.out.println(ans);
        byte by = 5;
        byte sum = (byte) (by*2);
        System.out.println(sum);










    }
}
