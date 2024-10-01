import java.util.Random;
import java.util.Arrays;

public class example10 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        populateArrayWithRandomNumbers(numbers);
        printArray(numbers);
        sortArrayDescending(numbers);
        printSortedArray(numbers);
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

    private static void sortArrayDescending(int[] array) {
        Arrays.sort(array); // сортировка в порядке убывания значений
        for (int i = 0; i < array.length / 2; ++i) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    private static void printSortedArray(int[] array) {
        System.out.print("Sorted array: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}