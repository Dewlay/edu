import java.util.InputMismatchException;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ввод текста
        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();
        
        // Ввод ключа с проверкой
        int key = 0;
        while (true) {
            System.out.println("Введите ключ:");
            try {
                key = scanner.nextInt();
                scanner.nextLine(); // очистка буфера
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите целое число");
                scanner.nextLine(); // очистка некорректного ввода
            }
        }
        
        // Шифрование текста
        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);
        
        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = scanner.nextLine().toLowerCase();
            
            if (answer.equals("y")) {
                // Дешифрование текста
                String decryptedText = encrypt(encryptedText, -key);
                System.out.println("Текст после обратного преобразования: " + decryptedText);
                break;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
        
        scanner.close();
    }
    
    // Метод для шифрования/дешифрования текста
    private static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();
        
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                // Определяем базовый символ (а или А) и размер алфавита
                int base = Character.isUpperCase(character) ? 'A' : 'a';
                int alphabetSize = 26;
                
                // Применяем шифрование
                int shifted = (character - base + key) % alphabetSize;
                if (shifted < 0) shifted += alphabetSize;
                
                result.append((char)(base + shifted));
            } else {
                // Если символ не буква, оставляем его без изменений
                result.append(character);
            }
        }
        
        return result.toString();
    }
} 