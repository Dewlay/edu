import java.util.Scanner;

//Использование оператора do-while
public class example3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of fibonacci numbers: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        do {
            System.out.printf("%d ", a);
            int c = a + b;
            a = b;
            b = c;
        } while (n > 2);
    }
}