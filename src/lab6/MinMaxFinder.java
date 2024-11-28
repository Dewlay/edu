public class MinMaxFinder {
    // Метод для поиска минимального и максимального значений
    public static int[] findMinMax(int... numbers) {
        // Проверка на пустой массив аргументов
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Должно быть передано хотя бы одно число");
        }
        
        // Инициализируем min и max первым элементом
        int min = numbers[0];
        int max = numbers[0];
        
        // Ищем минимум и максимум
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        
        // Возвращаем массив из двух элементов [min, max]
        return new int[] {min, max};
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
    
    // Метод для отображения подробного анализа
    public static void showDetailedAnalysis(int... numbers) {
        System.out.println("Анализ чисел:");
        displayArray(numbers, "Исходные числа");
        
        // Находим min и max
        int[] result = findMinMax(numbers);
        
        // Показываем процесс поиска
        System.out.println("Процесс поиска:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Число %d: %d%n", i + 1, numbers[i]);
            if (numbers[i] == result[0]) {
                System.out.println("  → Новый минимум!");
            }
            if (numbers[i] == result[1]) {
                System.out.println("  → Новый максимум!");
            }
        }
        
        System.out.println("Результат:");
        System.out.println("Минимальное значение: " + result[0]);
        System.out.println("Максимальное значение: " + result[1]);
        System.out.println();
    }
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        System.out.println("Демонстрация поиска минимума и максимума:\n");
        
        // Тест 1: Обычный набор чисел
        showDetailedAnalysis(5, 2, 8, 1, 9, 3);
        
        // Тест 2: Отрицательные числа
        showDetailedAnalysis(-5, -2, -8, -1, -9, -3);
        
        // Тест 3: Смешанные числа
        showDetailedAnalysis(-10, 0, 10, -5, 5);
        
        // Тест 4: Одинаковые числа
        showDetailedAnalysis(7, 7, 7, 7, 7);
        
        // Тест 5: Один элемент
        showDetailedAnalysis(42);
        
        try {
            // Тест 6: Пустой массив
            findMinMax();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        try {
            // Тест 7: null
            findMinMax(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
} 