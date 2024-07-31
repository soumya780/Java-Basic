public class Overloadpara {
    public static int sum(int a, int b)
    {
        return a+b;

    }
    public static float sum(float a, float b )
    {
        return a+b;

    }
    public static void main(String args[])
    {
        System.out.println(sum(22,33));
        System.out.println(sum(11.3f,3.4f));

    }

}
