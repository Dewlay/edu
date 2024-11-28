public class NumberAnalyzer {
    // Метод для поиска максимального значения
    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    // Метод для поиска минимального значения
    public static int findMin(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    // Метод для вычисления среднего значения
    public static double findAverage(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        
        long sum = 0;  // используем long для предотвращения переполнения
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
    
    // Метод для анализа всех значений сразу
    public static void analyzeNumbers(int... numbers) {
        System.out.println("Анализ чисел: " + arrayToString(numbers));
        System.out.println("Максимальное значение: " + findMax(numbers));
        System.out.println("Минимальное значение: " + findMin(numbers));
        System.out.printf("Среднее значение: %.2f%n", findAverage(numbers));
        System.out.println();
    }
    
    // Вспомогательный метод для преобразования массива в строку
    private static String arrayToString(int[] numbers) {
        if (numbers.length == 0) return "[]";
        
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < numbers.length; i++) {
            result.append(numbers[i]);
            if (i < numbers.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        // Тест с разным количеством аргументов
        System.out.println("Тест с несколькими аргументами:");
        analyzeNumbers(5, 2, 8, 1, 9, 3);
        
        // Тест с массивом
        System.out.println("Тест с массивом:");
        int[] array = {15, 7, 4, 12, 9, 6};
        analyzeNumbers(array);
        
        // Тест с одним числом
        System.out.println("Тест с одним числом:");
        analyzeNumbers(42);
        
        // Тест с отрицательными числами
        System.out.println("Тест с отрицательными числами:");
        analyzeNumbers(-5, -2, -8, -1, -9, -3);
        
        try {
            // Тест с пустым массивом
            System.out.println("Тест с пустым массивом:");
            analyzeNumbers(new int[]{});
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
} 