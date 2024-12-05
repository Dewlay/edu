package lab8;

import java.io.*;

public class Zadanie2_FileFilter {
    public static void main(String[] args) {
        // Создание исходного файла
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("SourceFile.txt"), "UTF-8"))) {
            writer.write("Первая строка\n");
            writer.write("Вторая строка\n");
            writer.write("12.5\n-3.4\n7.8\n-1.2\n9.0\n");
        } catch (IOException e) {
            System.out.println("Ошибка при создании исходного файла: " + e);
            return;
        }

        // Чтение из исходного файла и запись в результирующий файл
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("SourceFile.txt"), "UTF-8"));
             BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("ResultFile.txt"), "UTF-8"))) {

            // Чтение и запись строк
            String firstLine = br.readLine(); // Первая строка
            String secondLine = br.readLine(); // Вторая строка
            bw.write(secondLine + "\n");

            // Чтение и фильтрация чисел
            String line;
            while ((line = br.readLine()) != null) {
                double number = Double.parseDouble(line);
                if (number > 0) {
                    bw.write(number + "\n");
                }
            }

        } catch (IOException e) {
            System.out.println("Ошибка при обработке файлов: " + e);
        }
    }
}