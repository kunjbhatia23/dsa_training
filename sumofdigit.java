import java.util.Scanner;

public class sumofdigit {
    public static void sumOfDigitsVoid(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits (void method): " + sum);
    }

    public static int sumOfDigitsInt(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        sumOfDigitsVoid(number);
        int result = sumOfDigitsInt(number);
        System.out.println("Sum of digits (int return method): " + result);
        scanner.close();
    }
}
