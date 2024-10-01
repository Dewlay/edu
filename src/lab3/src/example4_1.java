import java.util.Scanner;

//Использование оператора for
public class example4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            for (int i = num2; i <= num1; ++i) {
                System.out.printf("%d ", i);
            }
        } else {
            for (int i = num1; i <= num2; ++i) {
                System.out.printf("%d ", i);
            }
        }
    }
}