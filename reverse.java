public class reverse {
    public static void main(String args[])
    {
        int n = 9946467;
        int rev =0;

        while (n > 0)
        {
           // int last = n %10;
            //System.out.print(last+ " ");
            //n= n / 10;
            int lastDigit= n %10;
            rev =(rev*10)+lastDigit;
            n=n/10;



        }
        System.out.println(rev );

    }
}
