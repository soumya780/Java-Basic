package basics;
import java.util.*;

public class total {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the price of pencil");
        float p = s. nextFloat();
        System.out.println("Enter the price of pen");
        float pen = s. nextFloat();
        System.out.println("Enter the price of eraser");
        float e = s. nextFloat();
        float total = p + pen + e;
        //float gst = total*18/100;
        //float bill = total+gst;
        float bill = total + (0.18f*total);
        System.out.println("The Total bill excluding gst is :"+total);
       // System.out.println("The gst for the total amount is:"+gst);

        System.out.println("To pay :"+bill);
         int $ = 24;
         System.out.println($);




    }

}
