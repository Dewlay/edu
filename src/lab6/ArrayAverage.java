public class ArrayAverage {
    // Метод для вычисления среднего значения элементов массива
    public static double calculateAverage(int[] numbers) {
        // Проверка на null
        if (numbers == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }
        
        // Проверка на пустой массив
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        
        // Используем long для суммы, чтобы избежать переполнения
        long sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        // Возвращаем среднее значение
        return (double) sum / numbers.length;
    }
    
    // Метод для отображения массива
    public static void displayArray(int[] arr, String message) {
        System.out.print(message + ": [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // Метод для отображения подробного расчета
    public static void showDetailedCalculation(int[] numbers) {
        displayArray(numbers, "Массив");
        
        // Показываем сумму
        long sum = 0;
        System.out.print("Сумма: ");
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + sum);
        
        // Показываем деление
        System.out.printf("Среднее значение: %d / %d = %.2f%n%n", 
                         sum, numbers.length, (double)sum/numbers.length);
    }
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        System.out.println("Демонстрация вычисления среднего значения:\n");
        
        // Тест 1: Обычный массив
        int[] numbers1 = {1, 2, 3, 4, 5};
        showDetailedCalculation(numbers1);
        
        // Тест 2: Массив с отрицательными числами
        int[] numbers2 = {-5, -3, 0, 3, 5};
        showDetailedCalculation(numbers2);
        
        // Тест 3: Массив с одинаковыми числами
        int[] numbers3 = {7, 7, 7, 7, 7};
        showDetailedCalculation(numbers3);
        
        // Тест 4: Массив с одним элементом
        int[] numbers4 = {42};
        showDetailedCalculation(numbers4);
        
        // Тест 5: Массив с большими числами
        int[] numbers5 = {1000, 2000, 3000, 4000, 5000};
        showDetailedCalculation(numbers5);
        
        try {
            // Тест 6: Пустой массив
            int[] empty = new int[0];
            calculateAverage(empty);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        try {
            // Тест 7: null массив
            calculateAverage(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
} 