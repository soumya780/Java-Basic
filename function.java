import java.util.*;
public class function {
    //Function Over Loading
    public static int sum(int num1, int num2 ) // parameteres pr formal parameters
    {
        return num1+num2;

    }
    public static int sum(int num1, int num2, int num3)
    {
        return num1+num2+num3;
    }

    public static void main(String args[])
    {
       System.out.println(sum(3,5));
       System.out.println(sum(2,5,1));




    }


}
