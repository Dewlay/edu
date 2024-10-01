import java.util.Scanner;

//Использование оператора while
public class example3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of fibonacci numbers: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.printf("%d %d ", a, b);
        while (n > 2) {
            int c = a + b;
            System.out.printf("%d ", c);
            a = b;
            b = c;
            n--;
        }
    }
}