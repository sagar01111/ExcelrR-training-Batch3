import java.util.Scanner;

public class NearestMultiple {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the rounding base (e.g., 5, 10, 20): ");
        int base = scanner.nextInt();

        int remainder = number % base;
        int nearestMultiple;

        if (remainder < base / 2.0) {
            nearestMultiple = number - remainder;
        } else {
            nearestMultiple = number + (base - remainder);
        }

        System.out.println("The number " + number + " is nearest to " + nearestMultiple + ".");

        scanner.close();
    }
}