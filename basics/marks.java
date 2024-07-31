package basics;
import java.util.*;
public class marks {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your mark:");
        int number =s. nextInt();
         // ternary operator
        String type = (number>=33)? "pass":"fail";
        System.out.println(type);
        // looping
        if (number >=33)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }

}
