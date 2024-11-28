package lab8;
import java.io.*;
import java.util.Scanner;

public class FilesData {
    public static void main(String[] args) {
        // Создаём директорию My в текущей папке, если она не существует
        File directory = new File("My");
        directory.mkdirs();
        
        try {
            // 1. Создание и запись в исходный файл
            File f1 = new File("My/numIsh.txt");
            f1.createNewFile();
            
            try (Scanner sc = new Scanner(System.in, "cp1251");
                 DataOutputStream wr = new DataOutputStream(
                     new FileOutputStream(f1.getAbsolutePath()))) {
                
                System.out.println("Сколько вещественных чисел записать в файл?");
                int count = sc.nextInt();
                System.out.println("Введите числа:");
                
                for (int i = 0; i < count; i++) {
                    wr.writeFloat(sc.nextFloat());
                }
            }

            // 2. Создание второго файла и копирование данных
            File f2 = new File("My/numRez.txt");
            f2.createNewFile();
            
            // Используем try-with-resources для автоматического закрытия потоков
            try (DataInputStream rd = new DataInputStream(
                     new FileInputStream(f1.getAbsolutePath()));
                 DataOutputStream wr = new DataOutputStream(
                     new FileOutputStream(f2.getAbsolutePath()))) {
                
                // Читаем данные, пока не достигнем конца файла
                try {
                    while (true) {
                        float number = rd.readFloat();
                        wr.writeFloat(number);
                        System.out.println("Число " + number);
                    }
                } catch (EOFException e) {
                    System.out.println("Чтение файла завершено");
                }
            }
            
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
} 