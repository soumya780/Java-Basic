import java.util.*;

public class Switch {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    switch (number)
    {
        case 4: System.out.println("samosa");
            break;
        case 2:System.out.println("pizza");
            break;
        case 3 :System.out.println("shake");
            break;
        default: System.out.println("wake up");
    }
    }
}
