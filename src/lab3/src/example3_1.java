import java.util.Scanner;

//Использование оператора for
public class example3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of fibonacci numbers: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.printf("%d ", a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}