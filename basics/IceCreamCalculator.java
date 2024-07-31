package basics;
import java.util.Scanner;
public class IceCreamCalculator {
    public static int calculateIceCreamQuantity(int radius, int height) {
        return radius * ((2 * radius) + height);
    }

    public static void main(String[] args) {
        // Sample Input
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        int height = scanner.nextInt();

        // Function Call
        int result = calculateIceCreamQuantity(radius, height);
  
        System.out.println(result);
    }
}
