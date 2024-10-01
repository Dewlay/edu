import java.util.Random;

public class example9 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        populateArrayWithRandomNumbers(numbers);
        printArray(numbers);
        System.out.println("Minimum value: " + findMinimumValue(numbers));
        printIndicesOfMinimumValues(numbers);
    }

    private static void populateArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(100); // случайное число в диапазоне [0, 100]
        }
    }

    private static void printArray(int[] array) {
        System.out.print("Array: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static int findMinimumValue(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    private static void printIndicesOfMinimumValues(int[] array) {
        int min = findMinimumValue(array);
        int count = 1;
        System.out.print("Indexes of minimum values: ");
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == min) {
                System.out.printf("%d, ", i);
                count++;
                if (count == 10) {
                    break;
                }
            }
        }
        System.out.println();
    }
}