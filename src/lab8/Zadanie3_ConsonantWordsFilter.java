package lab8;

import java.io.*;
import java.util.regex.*;

public class Zadanie3_ConsonantWordsFilter {
    public static void main(String[] args) {
        // Создание исходного файла с текстом
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("SourceText.txt"), "UTF-8"))) {
            writer.write("Мой дядя самых честных правил,\n");
            writer.write("Когда не в шутку занемог,\n");
            writer.write("Он уважать себя заставил\n");
            writer.write("И лучше выдумать не мог.\n");
        } catch (IOException e) {
            System.out.println("Ошибка при создании исходного файла: " + e);
            return;
        }

        // Чтение из исходного файла и запись в результирующий файл
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("SourceText.txt"), "UTF-8"));
             BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("FilteredText.txt"), "UTF-8"))) {

            String line;
            int lineNumber = 0;
            Pattern consonantPattern = Pattern.compile("^[бвгджзйклмнпрстфхцчшщ]", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

            while ((line = br.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("\\s+");
                StringBuilder resultLine = new StringBuilder();
                int wordCount = 0;

                for (String word : words) {
                    if (consonantPattern.matcher(word).find()) {
                        resultLine.append(word).append(" ");
                        wordCount++;
                    }
                }

                if (wordCount > 0) {
                    bw.write("Строка " + lineNumber + ": " + resultLine.toString().trim() + " (слов: " + wordCount + ")\n");
                }
            }

        } catch (IOException e) {
            System.out.println("Ошибка при обработке файлов: " + e);
        }
    }
}