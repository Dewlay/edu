import java.util.Scanner;

//Использование оператора for
public class example5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the count of numbers: ");
        int count = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= count; ++i) {
            int num = findNumber(i);
            if (num > 0) {
                System.out.printf("Adding number: %d, sum: %d\n", num, sum + num);
                sum += num;
            }
        }
        System.out.println("Sum of numbers: " + sum);
    }

    private static int findNumber(int i) {
        if (i % 3 == 1 || i % 5 == 2) {
            return i;
        }
        return -1;
    }
}