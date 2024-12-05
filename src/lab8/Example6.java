package lab8;

import java.io.*;

public class Example6 {
    public static void main(String[] args) {
        // Создание тестового файла
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("MyFile1.txt"), "UTF-8"))) {
            
            System.out.println("Создание тестового файла MyFile1.txt");
            writer.write("Первая строка текста\n");
            writer.write("Вторая строка текста\n");
            writer.write("Третья строка текста с символами Unicode: ♪♫\n");
            writer.write("Четвёртая строка для теста\n");
            writer.write("Пятая завершающая строка\n");
            System.out.println("Тестовый файл создан\n");
        } catch (IOException e) {
            System.out.println("Ошибка при создании тестового файла: " + e);
            return;
        }

        // Часть 1: Посимвольное чтение/запись
        System.out.println("Часть 1: Посимвольное копирование");
        try (Reader in = new InputStreamReader(new FileInputStream("MyFile1.txt"), "UTF-8");
             Writer out = new OutputStreamWriter(new FileOutputStream("MyFile2.txt", true), "UTF-8")) {

            // Посимвольное чтение/запись
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
            System.out.println("\nФайл скопирован посимвольно в MyFile2.txt");

        } catch (IOException e) {
            System.out.println("Ошибка при посимвольном копировании: " + e);
        }

        // Часть 2: Буферизованное чтение/запись
        System.out.println("\nЧасть 2: Буферизованное копирование");
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("MyFile1.txt"), "UTF-8"));
             BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("MyFile3.txt"), "UTF-8"))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                System.out.println(line);
            }
            bw.flush();
            System.out.println("\nФайл скопирован с использованием буфера в MyFile3.txt");

        } catch (IOException e) {
            System.out.println("Ошибка при буферизованном копировании: " + e);
        }

        // Вывод информации о созданных файлах
        System.out.println("\nИнформация о созданных файлах:");
        printFileInfo("MyFile1.txt");
        printFileInfo("MyFile2.txt");
        printFileInfo("MyFile3.txt");
    }

    private static void printFileInfo(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("\nФайл: " + fileName);
            System.out.println("Размер: " + file.length() + " байт");
            System.out.println("Путь: " + file.getAbsolutePath());
        } else {
            System.out.println("\nФайл " + fileName + " не найден");
        }
    }
}