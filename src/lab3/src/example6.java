import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = validateSize(scanner.nextInt());
        int[] array = createArray(size);
        fillArrayWithRequiredNumbers(array, size);
        printArray(array, size);
    }

    private static int validateSize(int value) {
        if (value <= 0) {
            System.out.println("Invalid size of array!");
            throw new IllegalArgumentException("Invalid size of array!");
        }
        return value;
    }

    private static int[] createArray(int size) {
        int[] array = new int[size];
        return array;
    }

    private static void fillArrayWithRequiredNumbers(int[] array, int size) {
        for (int i = 0; i < size; ++i) {
            if ((i + 2) % 5 == 0) {
                array[i] = i + 2;
            }
        }
    }

    private static void printArray(int[] array, int size) {
        for (int i = 0; i < size; ++i) {
            System.out.printf("Element %d: %d\n", i, array[i]);
        }
    }
}