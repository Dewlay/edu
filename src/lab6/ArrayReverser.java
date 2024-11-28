public class ArrayReverser {
    // Метод для попарной перестановки элементов массива
    public static void reverseArray(char[] chars) {
        // Проверка на null
        if (chars == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }
        
        // Вычисляем середину массива
        int middle = chars.length / 2;
        
        // Меняем элементы местами
        for (int i = 0; i < middle; i++) {
            // Обмен значениями
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
    }
    
    // Метод для отображения массива
    public static void displayArray(char[] arr, String message) {
        System.out.print(message + ": [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("'" + arr[i] + "'");
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // Метод для отображения процесса перестановки
    public static void showDetailedReversal(char[] chars) {
        System.out.println("Процесс перестановки элементов:");
        displayArray(chars, "Исходный массив");
        
        // Создаем копию для пошагового отображения
        char[] workingArray = chars.clone();
        int middle = workingArray.length / 2;
        
        for (int i = 0; i < middle; i++) {
            // Показываем текущую перестановку
            System.out.printf("Меняем местами '%c' (индекс %d) и '%c' (индекс %d)%n",
                    workingArray[i], i, workingArray[workingArray.length - 1 - i], 
                    workingArray.length - 1 - i);
            
            // Выполняем перестановку
            char temp = workingArray[i];
            workingArray[i] = workingArray[workingArray.length - 1 - i];
            workingArray[workingArray.length - 1 - i] = temp;
            
            // Показываем результат после перестановки
            displayArray(workingArray, "Текущее состояние");
        }
        
        System.out.println("Перестановка завершена\n");
    }
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        System.out.println("Демонстрация перестановки элементов массива:\n");
        
        // Тест 1: Массив с четным количеством элементов
        char[] array1 = {'A', 'B', 'C', 'D', 'E', 'F'};
        showDetailedReversal(array1);
        
        // Тест 2: Массив с нечетным количеством элементов
        char[] array2 = {'1', '2', '3', '4', '5'};
        showDetailedReversal(array2);
        
        // Тест 3: Массив с двумя элементами
        char[] array3 = {'X', 'Y'};
        showDetailedReversal(array3);
        
        // Тест 4: Массив с одним элементом
        char[] array4 = {'Z'};
        showDetailedReversal(array4);
        
        // Тест 5: Пустой массив
        char[] array5 = new char[0];
        System.out.println("Тест с пустым массивом:");
        displayArray(array5, "До перестановки");
        reverseArray(array5);
        displayArray(array5, "После перестановки");
        
        try {
            // Тест 6: null массив
            reverseArray(null);
        } catch (IllegalArgumentException e) {
            System.out.println("\nОшибка: " + e.getMessage());
        }
    }
} 