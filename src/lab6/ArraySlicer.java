public class ArraySlicer {
    // Метод для создания нового массива из начальных элементов
    public static int[] getFirstElements(int[] sourceArray, int count) {
        // Проверка на null
        if (sourceArray == null) {
            throw new IllegalArgumentException("Исходный массив не может быть null");
        }
        
        // Проверка на отрицательное количество элементов
        if (count < 0) {
            throw new IllegalArgumentException("Количество элементов не может быть отрицательным");
        }
        
        // Определяем реальное количество элементов для копирования
        int actualCount = Math.min(count, sourceArray.length);
        
        // Создаем новый массив нужной длины
        int[] result = new int[actualCount];
        
        // Копируем элементы
        for (int i = 0; i < actualCount; i++) {
            result[i] = sourceArray[i];
        }
        
        return result;
    }
    
    // Вспомогательный метод для отображения массива
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
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        // Исходный массив
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("Демонстрация работы с массивами:\n");
        
        // Показываем исходный массив
        displayArray(originalArray, "Исходный массив");
        
        // Тест 1: Взять первые 5 элементов
        int[] result1 = getFirstElements(originalArray, 5);
        displayArray(result1, "Первые 5 элементов");
        
        // Тест 2: Взять больше элементов, чем есть в массиве
        int[] result2 = getFirstElements(originalArray, 15);
        displayArray(result2, "Попытка взять 15 элементов (копия всего массива)");
        
        // Тест 3: Взять 0 элементов
        int[] result3 = getFirstElements(originalArray, 0);
        displayArray(result3, "Пустой массив (0 элементов)");
        
        // Тест 4: Взять 3 элемента
        int[] result4 = getFirstElements(originalArray, 3);
        displayArray(result4, "Первые 3 элемента");
        
        // Проверка на независимость массивов
        System.out.println("\nПроверка независимости массивов:");
        result1[0] = 100;
        displayArray(originalArray, "Исходный массив после изменения результата");
        displayArray(result1, "Измененный результат");
        
        try {
            // Тест 5: Передача null
            getFirstElements(null, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("\nОшибка: " + e.getMessage());
        }
        
        try {
            // Тест 6: Отрицательное количество элементов
            getFirstElements(originalArray, -1);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
} 