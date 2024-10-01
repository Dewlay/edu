import java.util.Scanner;

//Использование оператора do-while
public class example4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            int i = num2;
            do {
                System.out.printf("%d ", i);
                ++i;
            } while (i <= num1);
        } else {
            int i = num1;
            do {
                System.out.printf("%d ", i);
                ++i;
            } while (i <= num2);
        }
    }
}