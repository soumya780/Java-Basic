package basics;
public class primenum {
   // public static boolean isPrime(int n)
   // {
        //Corner cases
        //1
        //only for n <=2

//        boolean isPrime =true;
//        for (int i=2; i<=n-1;i++)
//        {
//            if (n % i==0)
//            {
//            isPrime=false;
//
//            }
//        }
//        return isPrime;
//
//    }
    //Optimized way to print prime number.
    public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;

        }
        for (int i=2;i<=Math.sqrt(n);i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void primeinRange(int n)
    {
        for (int i =2; i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i+"");

            }
        }
        System.out.println();
    }
    public static void main(String args[])
    {
       primeinRange(100);


    }


}
