import java.util.*;
public class Break {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Enter Your chosen number please:");

            int n = s.nextInt();
            if(n%10==0)
            {
                break;
            }
            System.out.println("Your number:" + n);



        }
        while(true);
    }

}
