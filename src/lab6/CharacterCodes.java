public class CharacterCodes {
    // Метод для преобразования символьного массива в массив кодов
    public static int[] getCharacterCodes(char[] chars) {
        // Проверка на null
        if (chars == null) {
            throw new IllegalArgumentException("Массив символов не может быть null");
        }
        
        // Создаем новый массив той же длины
        int[] codes = new int[chars.length];
        
        // Заполняем массив кодами символов
        for (int i = 0; i < chars.length; i++) {
            codes[i] = (int) chars[i];
        }
        
        return codes;
    }
    
    // Вспомогательный метод для отображения символьного массива
    public static void displayCharArray(char[] arr, String message) {
        System.out.print(message + ": [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("'" + arr[i] + "'");
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // Вспомогательный метод для отображения массива кодов
    public static void displayCodeArray(int[] arr, String message) {
        System.out.print(message + ": [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // Метод для отображения подробной информации о символах и их кодах
    public static void displayDetailedInfo(char[] chars) {
        System.out.println("Подробная информация о символах:");
        for (int i = 0; i < chars.length; i++) {
            System.out.printf("Символ: '%c', Код: %d%n", chars[i], (int)chars[i]);
        }
        System.out.println();
    }
    
    // Демонстрация работы класса
    public static void main(String[] args) {
        System.out.println("Демонстрация преобразования символов в коды:\n");
        
        // Тест 1: Массив с буквами
        char[] letters = {'A', 'B', 'C', 'D', 'E'};
        displayCharArray(letters, "Массив букв");
        int[] letterCodes = getCharacterCodes(letters);
        displayCodeArray(letterCodes, "Коды букв");
        displayDetailedInfo(letters);
        
        // Тест 2: Массив с цифрами
        char[] digits = {'1', '2', '3', '4', '5'};
        displayCharArray(digits, "Массив цифр");
        int[] digitCodes = getCharacterCodes(digits);
        displayCodeArray(digitCodes, "Коды цифр");
        displayDetailedInfo(digits);
        
        // Тест 3: Массив со специальными символами
        char[] special = {'!', '@', '#', '$', '%'};
        displayCharArray(special, "Массив специальных символов");
        int[] specialCodes = getCharacterCodes(special);
        displayCodeArray(specialCodes, "Коды специальных символов");
        displayDetailedInfo(special);
        
        // Тест 4: Пустой массив
        char[] empty = new char[0];
        displayCharArray(empty, "Пустой массив");
        int[] emptyCodes = getCharacterCodes(empty);
        displayCodeArray(emptyCodes, "Коды пустого массива");
    }
} 