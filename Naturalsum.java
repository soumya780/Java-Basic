import java.util.*;

public class Naturalsum {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0;
        int i =1;
        while (i<=n)
        {
            sum=sum+i; // sum+=i;
            i++;

        }
        System.out.println("Sum of "+n+" terms:"+sum);


    }
}
