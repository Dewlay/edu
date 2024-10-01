import java.util.Scanner;

//Использование оператора while
public class example4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            int i = num2;
            while (i <= num1) {
                System.out.printf("%d ", i);
                ++i;
            }
        } else {
            int i = num1;
            while (i <= num2) {
                System.out.printf("%d ", i);
                ++i;
            }
        }
    }
}